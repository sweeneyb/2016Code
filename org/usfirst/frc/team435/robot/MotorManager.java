package org.usfirst.frc.team435.robot;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import edu.wpi.first.wpilibj.CANSpeedController;
import edu.wpi.first.wpilibj.SafePWM;
import edu.wpi.first.wpilibj.SpeedController;

public class MotorManager {

	// Made up this number. What's the highest possible?
	public static int MAX_CONTROLLER_ADDRESS = 256;

	private static MotorManager instance;
	private static Lock lock = new ReentrantLock();

	enum MotorProtocol {
		PWM, CAN;
	}

	SpeedController[][] controllers;

	protected MotorManager() {
		for (MotorProtocol proto : MotorProtocol.values()) {
			controllers[proto.ordinal()] = new SpeedController[MAX_CONTROLLER_ADDRESS];
		}
	}

	// Look up the Singleton pattern. We only want 1 instance of a motor
	// manager ever declared. This is overkill, but it's the right way to
	// do it. Ask if this is confusing.
	public static MotorManager getMotorManager() {
		if (instance == null) {
			lock.lock();
			if (instance == null) {
				instance = new MotorManager();
			}
			lock.unlock();
		}
		return instance;
	}

	public SpeedController getSpeedController(
			Class<? extends SpeedController> controllerClass, int channel) {
		List<Class<?>> declared = Arrays.asList(controllerClass
				.getDeclaredClasses());
		MotorProtocol proto;
		if (declared.contains(CANSpeedController.class)) {
			proto = MotorProtocol.CAN;
		} else if (declared.contains(SafePWM.class)) {
			proto = MotorProtocol.PWM;
		} else {
			throw new RuntimeException("Not a PWM or CAN controller.... ");
		}
		SpeedController controller = controllers[MotorProtocol.CAN.ordinal()][channel];
		if (controller == null) {
			Constructor<? extends SpeedController> con;
			try {
				con = controllerClass
						.getConstructor(Integer.TYPE);
				return con.newInstance(channel);
			} catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
			
		} else {
			// Can we do better?
			throw new RuntimeException("Motor protocol/channel in use");
		}

	}

}

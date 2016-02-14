package org.usfirst.frc.team435.robot;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import edu.wpi.first.wpilibj.SpeedController;

public class MotorSet {

	public List<SpeedController> speedControllers = new ArrayList<>(3);
	
	public void setSpeed(OI oi, Function<OI, Double> mapper) {
		for (SpeedController speedController : speedControllers) {
			speedController.set(mapper.apply(oi));
		}
	}
}

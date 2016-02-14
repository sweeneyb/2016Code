package org.usfirst.frc.team435.robot;

import org.usfirst.frc.team435.robot.subsystems.BoulderLift;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static final int INTAKE_MOTOR = 0;
	public static final int LEFT_BUCKET_MOTOR = 1;
	public static final int RIGHT_BUCKET_MOTOR = 3;
	public static final int LIFT_MOTOR = 0;
	public static final int LIFT_MOTOR_TWO= 2;

	public static SpeedController intakeMotor;

	
	public static final int LEFT_MOTOR = 0;
	public static final int RIGHT_MOTOR = 1;
	
	protected BoulderLift boulderLift;

	public static SpeedController leftMotor;
	public static SpeedController rightMotor;

	public static FunctionalRobotDrive drive;

	public static void init() {
		MotorManager mgr = MotorManager.getMotorManager();
		
		intakeMotor = mgr.getSpeedController(CANTalon.class, INTAKE_MOTOR);
		
		
		leftMotor = new CANTalon(LEFT_MOTOR);
		rightMotor = new CANTalon(RIGHT_MOTOR);
		drive = new FunctionalRobotDrive(leftMotor, rightMotor);
	}
	
	
	// eventually, all things should be instances.  Static is lazy/messy
	public void initInstance() {
		boulderLift = new BoulderLift();
	}
	
	public BoulderLift getBoulderLift() {
		return boulderLift;
	}
}

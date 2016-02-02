package org.usfirst.frc.team435.robot;

import edu.wpi.first.wpilibj.CANTalon;
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

	public static SpeedController intakeMotor;
	public static SpeedController leftBucketMotor;
	public static SpeedController rightBucketMotor;
	
	public static final int LEFT_MOTOR = 0;
	public static final int RIGHT_MOTOR = 1;

	public static SpeedController leftMotor;
	public static SpeedController rightMotor;

	public static RobotDrive drive;
	public static SpeedController liftMotor;

	public static void init() {
		intakeMotor = new CANTalon(INTAKE_MOTOR);
		leftBucketMotor = new CANTalon(LEFT_BUCKET_MOTOR);
		rightBucketMotor = new CANTalon(RIGHT_BUCKET_MOTOR);
		leftMotor = new CANTalon(LEFT_MOTOR);
		rightMotor = new CANTalon(RIGHT_MOTOR);
		drive = new RobotDrive(leftMotor, rightMotor);
		liftMotor = new Victor(LIFT_MOTOR);
	}
}

package org.usfirst.frc.team435.robot;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Jaguar;

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
	public static SpeedController leftBucketMotor;
	public static SpeedController rightBucketMotor;
	public static SpeedController liftMotor;
	public static SpeedController liftMotorTwo;

	public static void init() {
		intakeMotor = new CANTalon(INTAKE_MOTOR);
		leftBucketMotor = new CANTalon(LEFT_BUCKET_MOTOR);
		rightBucketMotor = new CANTalon(RIGHT_BUCKET_MOTOR);
		liftMotor = new Victor(LIFT_MOTOR);
		liftMotorTwo = new Jaguar(LIFT_MOTOR_TWO);
	}

}

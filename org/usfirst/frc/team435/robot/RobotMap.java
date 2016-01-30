package org.usfirst.frc.team435.robot;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static final int LEFT_MOTOR = 0;
	public static final int RIGHT_MOTOR = 1;

	public static SpeedController leftMotor;
	public static SpeedController rightMotor;

	public static RobotDrive drive;

	public static void init() {
		leftMotor = new CANTalon(LEFT_MOTOR);
		rightMotor = new CANTalon(RIGHT_MOTOR);
		drive = new RobotDrive(leftMotor, rightMotor);
	}
}

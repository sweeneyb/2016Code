package org.usfirst.frc.team435.robot.subsystems;

import org.usfirst.frc.team435.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class DriveTrain extends Subsystem {
	public void driveForward(double speed){
		RobotMap.drive.tankDrive(Math.abs(speed),Math.abs(speed));
	}
	public void driveBackward(double speed){
		RobotMap.drive.tankDrive(-Math.abs(speed),-Math.abs(speed));
	}
	public void turnLeft(double speed){
		RobotMap.drive.tankDrive(-Math.abs(speed),Math.abs(speed));
	}
	public void turnRight(double speed){
		RobotMap.drive.tankDrive(Math.abs(speed),-Math.abs(speed));
	}
	public void initDefaultCommand() {
	}
}

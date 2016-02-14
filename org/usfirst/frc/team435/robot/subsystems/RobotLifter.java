package org.usfirst.frc.team435.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;



/**
 *
 */
public class RobotLifter extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public void up(double speed)
	{
//		liftMotor.set(speed);
//		liftMotorTwo.set(speed);
	}
	public void down(double speed)
	{
//		liftMotor.set(speed);
//		liftMotorTwo.set(speed);
	}

	public void stay()
	{
//		liftMotor.set(0);
//		liftMotorTwo.set(0);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}


package org.usfirst.frc.team435.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import static org.usfirst.frc.team435.robot.RobotMap.leftBucketMotor;
import static org.usfirst.frc.team435.robot.RobotMap.rightBucketMotor;
import static org.usfirst.frc.team435.robot.RobotMap.intakeMotor;


/**
 *
 */
public class Boulder extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public void boulderUp(double speed)
	{
		leftBucketMotor.set(speed);
		rightBucketMotor.set(speed);
	}
	public void boulderDown(double speed)
	{
		leftBucketMotor.set(speed);
		rightBucketMotor.set(speed);
	}
	public void boulderIn(double speed)
	{
		intakeMotor.set(speed);
	}
	public void boulderOut(double speed)
	{
		intakeMotor.set(speed);
	}
	public void boulderLiftStay()
	{
		leftBucketMotor.set(0);
		rightBucketMotor.set(0);
	}
	public void intakeStay()
	{
		intakeMotor.set(0);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}


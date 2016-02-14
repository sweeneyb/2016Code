package org.usfirst.frc.team435.robot.subsystems;

import org.usfirst.frc.team435.robot.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class BoulderLift extends Subsystem {
	
	protected SpeedController leftBucketMotor;
	protected SpeedController rightBucketMotor;
	
	public BoulderLift() {
		super("BoulderLift");
		leftBucketMotor = new CANTalon(RobotMap.LEFT_BUCKET_MOTOR);
		rightBucketMotor = new CANTalon(RobotMap.RIGHT_BUCKET_MOTOR);
	}
	
    public void initDefaultCommand() {
    	
    }
        
    public void bucketDown(double speed){
    	setBucketSpeed(Math.abs(speed));
    }
    
    public void bucketUp(double speed){
    	setBucketSpeed(-Math.abs(speed));
    }
    
    public void setBucketSpeed(double speed){
    	leftBucketMotor.set(speed);
    	rightBucketMotor.set(speed);
    }
}


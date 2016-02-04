package org.usfirst.frc.team435.robot.subsystems;

import static org.usfirst.frc.team435.robot.RobotMap.leftBucketMotor;
import static org.usfirst.frc.team435.robot.RobotMap.rightBucketMotor;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class BoulderLift extends Subsystem {
	
    public void initDefaultCommand() {
    	
    }
    
    public void bucketDown(double speed){
    	setBucket(Math.abs(speed));
    }
    
    public void bucketUp(double speed){
    	setBucket(-Math.abs(speed));
    }
    
    private void setBucket(double speed){
    	leftBucketMotor.set(speed);
    	rightBucketMotor.set(speed);
    }
}


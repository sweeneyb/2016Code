package org.usfirst.frc.team435.robot.subsystems;
import static org.usfirst.frc.team435.robot.RobotMap.intakeMotor;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class BoulderIntake extends Subsystem {

    public void initDefaultCommand() {

    }
    
    public void intake(double speed){
    	setIntake(-Math.abs(speed));
    }
    
    private void setIntake(double speed) {
    	intakeMotor.set(speed);
    }
    
    public void eject(double speed){
    	setIntake(Math.abs(speed));
    }
}

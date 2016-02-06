package org.usfirst.frc.team435.robot.commands;
import static org.usfirst.frc.team435.robot.Robot.*;
import edu.wpi.first.wpilibj.command.Command;
/**
 *
 */
public class DriveFoward extends Command {
	
	private double speed;

    public DriveFoward(double speed,double time) {
       requires(driveTrain);
       setTimeout(time);
       this.speed = speed;
    }

    
    protected void initialize() {
    }

    
    protected void execute() {
    	driveTrain.driveForward(speed);
    }

    
    protected boolean isFinished() {
        return isTimedOut();
    }

    
    protected void end() {
    }

    
    protected void interrupted() {
    }
}

package org.usfirst.frc.team435.robot.commands;
import static org.usfirst.frc.team435.robot.Robot.*;
import edu.wpi.first.wpilibj.command.Command;
/**
 *
 */
public class DriveBackwards extends Command {
	
	private double speed;

    public DriveBackwards(double speed,double time) {
       requires(driveTrain);
       setTimeout(time);
       this.speed = speed;
    }

    
    protected void initialize() {
    }

    
    protected void execute() {
    	driveTrain.driveBackward(speed);
    }

    
    protected boolean isFinished() {
        return isTimedOut();
    }

    
    protected void end() {
    	driveTrain.driveBackward(0);
    }

    
    protected void interrupted() {
    }
}

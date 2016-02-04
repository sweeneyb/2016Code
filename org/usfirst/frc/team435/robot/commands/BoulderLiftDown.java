package org.usfirst.frc.team435.robot.commands;
import static org.usfirst.frc.team435.robot.Robot.boulderLift;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */

public class BoulderLiftDown extends Command {

	private double speed;
	
    public BoulderLiftDown(double speed, double time) {
    	requires(boulderLift);
    	setTimeout(time);
    	this.speed = speed;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	boulderLift.bucketDown(speed);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}

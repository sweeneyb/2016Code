package org.usfirst.frc.team435.robot.commands;
import static org.usfirst.frc.team435.robot.Robot.boulderIntake;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */

public class BoulderEject extends Command {
	
	private double speed;
	
    public BoulderEject(double speed, double time) {
    	requires(boulderIntake);
    	setTimeout(time);
    	this.speed = speed;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	boulderIntake.eject(speed);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	boulderIntake.eject(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}

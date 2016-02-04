package org.usfirst.frc.team435.robot.commands;
import static org.usfirst.frc.team435.robot.Robot.*;
import edu.wpi.first.wpilibj.command.Command;
/**
 *
 */
public class TurnRight extends Command {
	
	private double speed;

    public TurnRight(double speed,double time) {
       requires(driveTrain);
       setTimeout(time);
       this.speed = speed;
    }

    
    protected void initialize() {
    }

    
    protected void execute() {
    	driveTrain.turnRight(speed);
    }

    
    protected boolean isFinished() {
        return isTimedOut();
    }

    
    protected void end() {
    }

    
    protected void interrupted() {
    }
}

package org.usfirst.frc.team435.robot.automodes;

import org.usfirst.frc.team435.robot.commands.DriveFoward;
import org.usfirst.frc.team435.robot.commands.TurnLeft;
import org.usfirst.frc.team435.robot.commands.TurnRight;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class ReachLowGoalMiddle extends CommandGroup {
    
    public  ReachLowGoalMiddle() {
        addSequential(new DriveFoward(1, 6));
        addSequential(new TurnRight(1, 2));
        addSequential(new DriveFoward(1, 2));
        addSequential(new TurnLeft(1, 2));
        addSequential(new DriveFoward(1, 4));
    }
}

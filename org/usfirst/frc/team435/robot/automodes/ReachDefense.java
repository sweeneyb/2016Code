package org.usfirst.frc.team435.robot.automodes;

import org.usfirst.frc.team435.robot.commands.DriveFoward;
import org.usfirst.frc.team435.robot.commands.TurnLeft;
import org.usfirst.frc.team435.robot.commands.TurnRight;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class ReachDefense extends CommandGroup {
    
    public  ReachDefense() {
        addSequential(new DriveFoward(1, 2));
        addSequential(new TurnLeft(.5, 1));
        addSequential(new DriveFoward(1, 2));
        addSequential(new TurnRight(.5, 1));
        addSequential(new DriveFoward(1, 5));
    }
}

package org.usfirst.frc.team435.robot.automodes;

import org.usfirst.frc.team435.robot.commands.BoulderEject;
import org.usfirst.frc.team435.robot.commands.DriveFoward;
import org.usfirst.frc.team435.robot.commands.TurnRight;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class CrossLowBar extends CommandGroup {
    
    public  CrossLowBar() {
        addSequential(new DriveFoward(1, 6));
        addSequential(new TurnRight(1, .5));
        addSequential(new DriveFoward(1, 3));
        addSequential(new BoulderEject(1, 3));
        
    }
}

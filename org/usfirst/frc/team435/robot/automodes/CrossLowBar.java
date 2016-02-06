package org.usfirst.frc.team435.robot.automodes;

import org.usfirst.frc.team435.robot.commands.DriveFoward;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class CrossLowBar extends CommandGroup {
    
    public  CrossLowBar() {
        addSequential(new DriveFoward(1, 5));
    }
}

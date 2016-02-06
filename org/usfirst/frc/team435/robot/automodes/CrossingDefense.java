package org.usfirst.frc.team435.robot.automodes;

import edu.wpi.first.wpilibj.command.CommandGroup;

import org.usfirst.frc.team435.robot.commands.DriveFoward;

/**
 *
 */
public class CrossingDefense extends CommandGroup {
    
    public  CrossingDefense() {
        addSequential(new DriveFoward(1, 6));
        
    }
}

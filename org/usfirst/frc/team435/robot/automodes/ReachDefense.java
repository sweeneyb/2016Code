package org.usfirst.frc.team435.robot.automodes;

import org.usfirst.frc.team435.robot.commands.DriveFoward;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class ReachDefense extends CommandGroup {
    
    public  ReachDefense() {
        addSequential(new DriveFoward(1, 2));
        
    }
}

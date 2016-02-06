package org.usfirst.frc.team435.robot.automodes;

import org.usfirst.frc.team435.robot.commands.BoulderLiftUp;
import org.usfirst.frc.team435.robot.commands.DriveFoward;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class CrossPortcullis extends CommandGroup {
    
    public  CrossPortcullis() {
        addSequential(new DriveFoward(1, 2));
        addSequential(new BoulderLiftUp(1, 3));
        addSequential(new DriveFoward(1, 4));
    }
}

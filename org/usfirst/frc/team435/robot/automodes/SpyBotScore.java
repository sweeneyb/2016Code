package org.usfirst.frc.team435.robot.automodes;

import org.usfirst.frc.team435.robot.commands.DriveFoward;
import org.usfirst.frc.team435.robot.commands.TurnLeft;
import org.usfirst.frc.team435.robot.commands.TurnRight;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class SpyBotScore extends CommandGroup {
    
    public  SpyBotScore() {
        addSequential(new TurnRight(1, .5));   
        addSequential(new DriveFoward(1, 2));
        addSequential(new TurnLeft(1, 1));
        addSequential(new DriveFoward(1, 3));
        }
}

package org.usfirst.frc.team435.robot;

import java.util.function.Function;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;

public class FunctionalRobotDrive extends RobotDrive {

	public FunctionalRobotDrive(SpeedController left, SpeedController right) {
		super(left, right);
	}
	
	public void functionalArcadeDrive(Double x, Double y, Function<Double, Double> mapping) {
		arcadeDrive(mapping.apply(x), mapping.apply(y));
	}

}

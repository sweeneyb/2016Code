package org.usfirst.frc.team435.robot;

import junit.framework.Assert;

import org.junit.Test;

import edu.wpi.first.wpilibj.CANSpeedController;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.SpeedController;

public class TestMotorTypes {

	
	@Test
	public void isTalonCAN() {
		SpeedController controller = new CANTalon(0);
		Assert.assertTrue(controller instanceof CANSpeedController); 
	}
}

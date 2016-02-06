package org.usfirst.frc.team435.robot;

import edu.wpi.first.wpilibj.Joystick;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public Joystick smoStick;
    public Joystick drivestick;
	

	public static final int DRIVESTICK_PORT = 0;
	
    public static final int SMO_STICK_PORT = 1;
	public static final int BOULDER_INTAKE_AXIS = 2;
	public static final int BUCKET_LIFT_AXIS = 5;
	public static final int END_GAME_UP_AXIS = 3;
	public static final int END_GAME_DOWN_AXIS = 3;
	
	
	
	public OI(){
    	drivestick = new Joystick(DRIVESTICK_PORT);
		smoStick = new Joystick(SMO_STICK_PORT);
    }
}


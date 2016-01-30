package org.usfirst.frc.team435.robot;

import edu.wpi.first.wpilibj.Joystick;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public Joystick smoStick;
    public Joystick drivestick;
	
	public static final int SMO_STICK_PORT = 1;
	public static final int INTAKE_AXIS = 0;
	public static final int LIFT_AXIS = 1;
        
    public static final int DRIVESTICK_PORT = 0;
    public static final int DRIVEFORWARD_AXIS = 0;
    public static final int TURN_AXIS = 1;
              
      
    public OI(){
    	drivestick = new Joystick(DRIVESTICK_PORT);
		smoStick = new Joystick(SMO_STICK_PORT);
    }
}


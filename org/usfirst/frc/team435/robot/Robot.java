package org.usfirst.frc.team435.robot;

import java.util.function.Function;

import org.usfirst.frc.team435.robot.subsystems.BoulderIntake;
import org.usfirst.frc.team435.robot.subsystems.BoulderLift;
import org.usfirst.frc.team435.robot.subsystems.DriveTrain;
import org.usfirst.frc.team435.robot.subsystems.RobotLifter;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	private static final double DEADBAND = 0;
	public static DriveTrain driveTrain = new DriveTrain();
	public static OI oi;

	public static BoulderLift boulderLift = new BoulderLift();
	public static BoulderIntake boulderIntake = new BoulderIntake();

	public static RobotLifter robotLifter = new RobotLifter();
	protected MotorSet lifter;

	RobotMap roboMap = new RobotMap();

	// Command autonomousCommand;
	// SendableChooser chooser;

	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	public void robotInit() {
		oi = new OI();
		// chooser = new SendableChooser();
		// chooser.addDefault("Default Auto", new ExampleCommand());
		// chooser = new SendableChooser();
		// chooser.addObject("My Auto", new MyAutoCommand());
		// SmartDashboard.putData("Auto mode", chooser);
		RobotMap.init();
		roboMap = new RobotMap();
		roboMap.initInstance();
		lifter = new MotorSet();
		lifter.speedControllers.add(MotorManager.getMotorManager().getSpeedController(Victor.class, RobotMap.LIFT_MOTOR));
		lifter.speedControllers.add(MotorManager.getMotorManager().getSpeedController(Victor.class, RobotMap.LIFT_MOTOR_TWO));

	}

	/**
	 * This function is called once each time the robot enters Disabled mode.
	 * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
	 */
	public void disabledInit() {

	}

	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable
	 * chooser code works with the Java SmartDashboard. If you prefer the
	 * LabVIEW Dashboard, remove all of the chooser code and uncomment the
	 * getString code to get the auto name from the text box below the Gyro
	 *
	 * You can add additional auto modes by adding additional commands to the
	 * chooser code above (like the commented example) or additional comparisons
	 * to the switch structure below with additional strings & commands.
	 */
	public void autonomousInit() {
		// autonomousCommand = (Command) chooser.getSelected();

		String autoSelected = SmartDashboard.getString("Auto Selector",
				"Default");
		switch (autoSelected) {
		case "My Auto":
			break;
		case "Default Auto":
		default:
			break;
		}

		// schedule the autonomous command (example)
		// if (autonomousCommand != null) autonomousCommand.start();
	}

	/**
	 * This function is called periodically during autonomous
	 */
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	public void teleopInit() {
		// This makes sure that the autonomous stops running when
		// teleop starts running. If you want the autonomous to
		// continue until interrupted by another command, remove
		// this line or comment it out.
		// if (autonomousCommand != null) autonomousCommand.cancel();
	}

	/**
	 * This function is called periodically during operator control
	 */
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
		RobotMap.intakeMotor
				.set(oi.smoStick.getRawAxis(OI.BOULDER_INTAKE_AXIS));

		roboMap.getBoulderLift().setBucketSpeed(
				oi.smoStick.getRawAxis(OI.BUCKET_LIFT_AXIS));
		if (oi.doubleSpeedButton.get()){
			RobotMap.drive.functionalArcadeDrive(oi.drivestick.getY(), oi.drivestick.getY(), deadband);
		}
		else{
			RobotMap.drive.functionalArcadeDrive(oi.drivestick.getY(), oi.drivestick.getY(), d -> d / 2);
		}
		lifter.setSpeed(oi, oi -> oi.smoStick.getRawAxis(OI.END_GAME_UP_AXIS)
				- oi.smoStick.getRawAxis(OI.END_GAME_DOWN_AXIS));
	}

	/**
	 * This function is called periodically during test mode
	 */
	public void testPeriodic() {
		LiveWindow.run();
	}

	Function<Double, Double> deadband = new Function<Double, Double>() {
		public Double apply(Double value) {
			if (Math.abs(value) < DEADBAND) {
				return 0D;
			} else {
				return (value - (Math.abs(value) / value * DEADBAND))
						/ (1 - DEADBAND);
			}
		}
	};
}

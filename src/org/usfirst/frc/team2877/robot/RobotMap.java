// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc.team2877.robot;
    
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import java.util.Vector;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveSpeedControllerFrontLeft;
    public static SpeedController driveSpeedControllerFrontRight;
    public static SpeedController driveSpeedControllerBackLeft;
    public static SpeedController driveSpeedControllerBackRight;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static RobotDrive robotDrive;

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveSpeedControllerFrontLeft = new TalonSRX(0);
        LiveWindow.addActuator("Drive", "Speed Controller 1", (TalonSRX) driveSpeedControllerFrontLeft);
        
        driveSpeedControllerFrontRight = new TalonSRX(1);
        LiveWindow.addActuator("Drive", "Speed Controller 2", (TalonSRX) driveSpeedControllerFrontRight);
        
        driveSpeedControllerBackLeft = new TalonSRX(2);
        LiveWindow.addActuator("Drive", "Speed Controller 3", (TalonSRX) driveSpeedControllerBackLeft);
        
        driveSpeedControllerBackRight = new TalonSRX(3);
        LiveWindow.addActuator("Drive", "Speed Controller 4", (TalonSRX) driveSpeedControllerBackRight);
        
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        
        robotDrive = new RobotDrive(driveSpeedControllerFrontLeft, driveSpeedControllerFrontRight, driveSpeedControllerBackLeft, driveSpeedControllerBackRight);
    }
}

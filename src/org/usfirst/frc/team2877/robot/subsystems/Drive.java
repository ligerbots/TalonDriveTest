// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc.team2877.robot.subsystems;

import org.usfirst.frc.team2877.robot.RobotMap;
import org.usfirst.frc.team2877.robot.commands.*;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.RobotDrive;

/**
 *
 */
public class Drive extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    /*JoystickButton joystickButton1 = RobotMap.joystickButton1;
    Joystick joystick = RobotMap.joystick;
     operatorInterface = RobotMap.operatorInterface;
     autonomousCommand = RobotMap.autonomousCommand;
     dummy1 = RobotMap.dummy1;
     basicOutlineBot = RobotMap.robot;//*/
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
	RobotDrive robotDrive = RobotMap.robotDrive;
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        setDefaultCommand(new DriveCmd());
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }

    double vC = 1.0;

    public void drive(double x, double y) {
    	robotDrive.arcadeDrive(vC * x, vC * y);
    }
}
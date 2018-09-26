package org.usfirst.frc.team5571.robot.subsystems;

import org.usfirst.frc.team5571.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class DriveTrainSubsystem extends Subsystem {
	
	DifferentialDrive drive;
	
	public DriveTrainSubsystem() {
		
		drive = new DifferentialDrive(
    			new Spark(RobotMap.LEFTMOTOR),
    			new Spark(RobotMap.RIGHTMOTOR)
    			);
		
	}
	
	public void arcadeDrive(double x, double y) {
    	drive.arcadeDrive(x, y);
    }

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
}

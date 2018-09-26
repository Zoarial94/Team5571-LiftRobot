package org.usfirst.frc.team5571.robot.commands;

import org.usfirst.frc.team5571.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.GenericHID.Hand;

/**
 *
 */
public class DriveTrainDrive extends Command {

    public DriveTrainDrive() {
    	requires(Robot.DriveTrainSub);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double sensitivity = 0.6;
    	Robot.DriveTrainSub.arcadeDrive(
    			Robot.m_oi.controller.getY() * sensitivity, 
    			Robot.m_oi.controller.getX(Hand.kLeft) * sensitivity 
    			);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}

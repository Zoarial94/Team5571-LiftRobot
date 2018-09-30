package org.usfirst.frc.team5571.robot.commands;

import org.usfirst.frc.team5571.robot.Robot;
import org.usfirst.frc.team5571.robot.subsystems.ElevatorSubsystem;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ElevatorRaise extends Command {
	
	ElevatorSubsystem SUB;

    public ElevatorRaise() {
    	SUB = Robot.m_ElevatorSub;
        requires(SUB);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	if(SUB.canMoveUp()) {
			SUB.raiseElevator();
		}
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return !SUB.canMoveUp();
    }

    // Called once after isFinished returns true
    protected void end() {
    	SUB.stopElevator();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}

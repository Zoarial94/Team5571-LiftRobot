package org.usfirst.frc.team5571.robot.subsystems;

import org.usfirst.frc.team5571.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.DigitalInput;

/**
 * 
 */
public class ElevatorSubsystem extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	//Physical motor
	Spark liftMotor;
	//Value to be passed into liftMotor's 'set' function
	double speed;
	
	//Inputs for Counters
	DigitalInput limitSwitchTop;
	DigitalInput limitSwitchBottom;
	
	//Counters to Detect When Switch is Hit
	Counter counterTop;
	Counter counterBottom;
	
	//Keep Track of When Switch is Hit
	boolean canMoveUp;
	boolean canMoveDown;
	
	//Constructor
	public ElevatorSubsystem() {
		//Set motor
		liftMotor = new Spark(RobotMap.ELEVATOR_MOTOR);
		//Set default speed
		speed = 0.2;
		
		//Set Digital Inputs
		limitSwitchTop = new DigitalInput(RobotMap.ELEVATOR_TOPSWITCH);
		limitSwitchTop = new DigitalInput(RobotMap.ELEVATOR_TOPSWITCH);
		//Set Counters for Limit Switches
		counterTop = new Counter(limitSwitchTop);
		counterBottom = new Counter(limitSwitchBottom);
	}
	
	//Raise Elevator
	public void raiseElevator() {
		liftMotor.set(speed);
	}
	
	//Lower Elevator
	public void lowerElevator() {
		liftMotor.set(-speed);
	}

	//Stop Elevator
	public void stopElevator() {
		liftMotor.set(0.0);
	}

	//Set Speed
	public void setSpeed(float speed) {
		if(speed < 0) {
			speed = -1 * speed;
		}
		this.speed = speed;
	}
	
	public void startCounter() {
		counterTop.reset();
		counterBottom.reset();
	}
	
	//Get Speed
	public double getSpeed() {
		return speed;
	}
	
	public boolean canMoveUp() {
		if(canMoveUp) {
			if(counterTop.get() > 0) {
				canMoveUp = false;
				return false;
			} else {
				return true;
			}
		}
		return false;
		
	}
	
	public boolean canMoveDown() {
		if(canMoveDown) {
			if(counterBottom.get() > 0) {
				canMoveDown = false;
				return false;
			} else {
				return true;
			}
		}
		return false;
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}


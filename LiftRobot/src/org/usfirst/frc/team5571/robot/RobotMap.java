/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5571.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	//USB PORTS
	public static final int CONTROLLER = 0;
	
	//PMW OUT - 7 TOTAL
	//4 wheels
	//1 pulley for elevator/carriage
	//2 for claw
	
						   	//Each motor output will control 2 motors in hardware
	public static final int LEFTMOTOR =       0,
                            RIGHTMOTOR =      1,
                            
                            //Lifts carriage and elevator
                            ELEVATORMOTOR =   2,
                            
                            //Right and left side of the claw
                            CLAWLEFT =        3,
                            CLAWRIGHT =       4;
}

package org.usfirst.frc.team1389.operation;

import java.util.Scanner;

import org.usfirst.frc.team1389.robot.RobotSoftware;
import org.usfirst.frc.team1389.robot.controls.ControlBoard;
import org.usfirst.frc.team1389.systems.GearArmSystem;

import com.team1389.system.SystemManager;

public class TeleopMain {
	SystemManager manager;
	ControlBoard controls;
	RobotSoftware robot;

	public TeleopMain(RobotSoftware robot) {
		this.robot = robot;
		
	}

	public void init() {
		controls = ControlBoard.getInstance();
		
		GearArmSystem arm = new GearArmSystem(robot.armIntake, controls.inTakeAxis(), controls.outTakeAxis(), controls.angleAxis(), robot.armMotion);
		Scanner scan  = new Scanner(System.in);
		String test = "asdas";
		arm.update();
		manager = new SystemManager(arm);
		manager.init();

	}

	public void periodic() {
		
		manager.update();
	}
}

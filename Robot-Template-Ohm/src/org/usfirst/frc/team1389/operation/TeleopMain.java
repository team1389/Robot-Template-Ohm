package org.usfirst.frc.team1389.operation;

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
		
		GearArmSystem arm = new GearArmSystem(robot.armIntake, null, null, null, robot.armMotion);
		arm.update();
		manager = new SystemManager(/* Add your subsystems here */);
		manager.init();

	}

	public void periodic() {
		
		robot.armIntake.set(controls.inTakeAxis().get());
		robot.armOutTake.set(controls.outTakeAxis().get());
		robot.armMotion.set(controls.angleAxis().get());
		
		manager.update();
	}
}

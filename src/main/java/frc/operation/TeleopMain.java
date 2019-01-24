package frc.operation;

import com.team1389.hardware.controls.ControlBoard;
import com.team1389.hardware.inputs.software.RangeIn;
import com.team1389.hardware.value_types.Speed;
import frc.robot.RobotSoftware;
import com.team1389.system.Subsystem;
import com.team1389.system.SystemManager;
import com.team1389.system.drive.CheesyDriveSystem;
import com.team1389.watch.Watcher;

public class TeleopMain {
	SystemManager manager;
	ControlBoard controls;
	RobotSoftware robot;
	Watcher watcher;
	Subsystem driveSystem;
	Subsystem elevatorSystem;

	public TeleopMain(RobotSoftware robot) {
		this.robot = robot;
	}

	public void init() {
		controls = ControlBoard.getInstance();
		manager = new SystemManager();
		manager.init();
	}


	public void periodic() {

		manager.update();

	}
}

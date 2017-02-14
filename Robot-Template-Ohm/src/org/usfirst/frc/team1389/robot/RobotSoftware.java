package org.usfirst.frc.team1389.robot;

import com.team1389.concurrent.OhmThreadService;

public class RobotSoftware extends RobotHardware {
	private static RobotSoftware INSTANCE = new RobotSoftware();

	public static RobotSoftware getInstance() {
		return INSTANCE;
	}

	public RobotSoftware() {
		threadService = new OhmThreadService(RobotConstants.MaxConcurrentThreads);
	}

	public OhmThreadService threadService;
}

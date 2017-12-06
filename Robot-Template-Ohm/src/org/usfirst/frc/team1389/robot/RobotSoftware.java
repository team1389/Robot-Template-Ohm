package org.usfirst.frc.team1389.robot;

import com.team1389.hardware.outputs.software.PercentOut;

public class RobotSoftware extends RobotHardware {
	
	private static RobotSoftware INSTANCE = new RobotSoftware();
	
	public PercentOut armIntake;
	public PercentOut armMotion;
	public PercentOut left;
	public PercentOut right;
	
	public static RobotSoftware getInstance()
	{
		return INSTANCE;
	}
	public RobotSoftware()
	{
		armIntake = victorIntake.getVoltageOutput();
		armMotion = victorMotion.getVoltageOutput();
	}

}

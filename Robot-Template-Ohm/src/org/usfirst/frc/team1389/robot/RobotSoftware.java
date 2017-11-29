package org.usfirst.frc.team1389.robot;

import com.team1389.hardware.outputs.software.PercentOut;

public class RobotSoftware extends RobotHardware
{
	private static RobotSoftware INSTANCE = new RobotSoftware();
	
	public PercentOut armIntake;
	public PercentOut armOutTake;
	public PercentOut armMotion;
	
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

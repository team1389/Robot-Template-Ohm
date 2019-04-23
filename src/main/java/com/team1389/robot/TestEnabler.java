package com.team1389.robot;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;

public class TestEnabler
{
    RobotSoftware robot;

    public TestEnabler(RobotSoftware robot)
    {
        this.robot = robot;
    }

    private void initNetworkTables()
    {

        // we need to be able to send whether its inverted to the gui
        /**
         * to do that, either need to add back operations implementation on
         * streams, and do a search for the word "invert", or add an arraylist
         * to every type of stream that stores all operations applied, and we
         * need to define constants for each operation. Then, we would need a
         * function in a util file that would search that list for the desired
         * constant (same operation done multiple times would cause issues)
         */

        // grab port nums from hardware (maybe pass all in as hardware), put all
        // of them
        // up in an array

        NetworkTableInstance inst = NetworkTableInstance.getDefault();
        NetworkTable table = inst.getTable("SparkTester");

    }

    // might just make this private and call it in constructor
    public void init()
    {
        // create network-table settable streams off of robotsoftware output
        // streams
    }
}
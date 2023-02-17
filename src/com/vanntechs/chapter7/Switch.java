package com.vanntechs.chapter7;

/*************************************************************
 * Switch.java
 * Dean & Dean
 *
 * This class models switches
 *************************************************************/

import java.util.Scanner;

public class Switch
{
    public final boolean NORMALLY_OPEN; // hit makes connection
    public String use;                  // role in the system
    private Controller control;

    //**********************************************************

    public Switch(
            boolean normallyOpen, Controller control, String use)
    {
        this.NORMALLY_OPEN = normallyOpen;
        this.control = control;
        this.use = use;
    } // end constructor

    //**********************************************************

    public void hit()
    {
        System.out.print(this.use + " switch hit. ");
        control.actionEvent();
    } // end hit
} // end class Switch

package com.vanntechs.chapter7;

/*************************************************************
 * Controller.java
 * Dean & Dean
 *
 * This class models controller with sensors attached.
 *************************************************************/

public class Controller
{
    private GarageDoorSystem system;
    private int state;  // 0=down, 1=goingUp, 2=up, 3=goingDown
    private boolean motorDirection = false;     // true = go up

    //*********************************************************

    public Controller(GarageDoorSystem system, int state)
    {
        this.system = system;
        this.state = state;
        if (state < 2)
        {
            this.motorDirection = true;
        }
    } // end constructor

    //*********************************************************

    public void actionEvent()
    {
        this.state++;
        this.state %= 4;
        if (this.state % 2 == 0)
        {
            this.motorDirection = !this.motorDirection;
        }
        system.setState(this.state);
    } // end actionEvent
} // end class Controller
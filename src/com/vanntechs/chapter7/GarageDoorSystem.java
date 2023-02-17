package com.vanntechs.chapter7;

/**************************************************************
 * GarageDoorSystem.java
 * Dean & Dean
 *
 * This represents a garage door.
 **************************************************************/

import java.util.Scanner;

public class GarageDoorSystem
{
    private int state;     // 0=down, 1=goingUp, 2=up, 3=goingDn
    private Controller control;
    private Switch upSwitch;            // upper limit switch
    private Switch downSwitch;          // lower limit switch
    private Switch button;              // electronic pushbutton

    //***********************************************************

    public GarageDoorSystem()
    {
        this.state = 0;
        System.out.println("Door initially down.");
        this.control = new Controller(this, this.state);
        this.upSwitch =
                new Switch(false, this.control, "Upper limit");
        this.downSwitch =
                new Switch(false, this.control, "Lower limit");
        this.button = new Switch(true, this.control, "Button");
    } // end constructor

    //***********************************************************

    public void setState(int state)
    {
        this.state = state;
    }

    //***********************************************************

    public void run(int steps)
    {
        Scanner stdIn = new Scanner(System.in);
        char input;
        boolean OK = false;

        for (int step=0; step<steps; step++)
        {
            System.out.print(
                    "Enter 'b' for button or 'e' for end switch: ");
            do
            {
                input = stdIn.nextLine().charAt(0);
                if (input == 'b')
                {
                    button.hit();
                    switch (state)
                    {
                        case 0: case 2:
                        System.out.println("Door stopped by button.");
                        break;
                        case 1:
                            System.out.println("Door moving up.");
                            break;
                        case 3:
                            System.out.println("Door moving down.");
                    } // end switch
                    OK = true;
                }
                else
                {
                    switch (state)
                    {
                        case 1:
                            upSwitch.hit();
                            System.out.println("Door is up.");
                            OK = true;
                            break;
                        case 3:
                            downSwitch.hit();
                            System.out.println("Door is down.");
                            OK = true;
                            break;
                        default:
                            System.out.print("Already stopped. Enter 'b': ");
                            OK = false;
                    } // end switch
                } // end if
            } while (!OK);
        } // end for
    } // end run
} // end GarageDoorSystem class
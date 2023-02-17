package com.vanntechs.chapter15;

/******************************************************
 * TestObject.java
 * Dean & Dean
 *
 * This is a typical heterogeneous object.
 ******************************************************/

import java.io.*;

public class TestObject implements Serializable
{
    private int id;
    private String text;
    public double number;

    //***************************************************

    public TestObject(int id, String text, double number)
    {
        this.id = id;
        this.text = text;
        this.number = number;
    } // end constructor

    //***************************************************

    public void display()
    {
        System.out.print(this.id + "\t");
        System.out.print(this.text + "\t");
        System.out.println(this.number);
    } // end display
} // end TestObject class

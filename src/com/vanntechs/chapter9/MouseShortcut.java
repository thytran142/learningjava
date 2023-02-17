package com.vanntechs.chapter9;

/************************************************************
 * MouseShortcut.java
 * Dean & Dean
 *
 * This class illustrates uses and omissions of this.
 ************************************************************/

public class MouseShortcut
{
    private int age;          // age in days
    private double weight;    // weight in grams

    //********************************************************

    public MouseShortcut(int age, double weight)
    {
        setAge(age);
        setWeight(weight);
    } // end constructor

    //********************************************************

    public void setAge(int a)
    {
        age = a;
    } // end setAge

    //********************************************************

    public void setWeight(double weight)
    {
        this.weight = weight;
    } // end setWeight

    //*********************************************************

    public void print()
    {
        System.out.println("age = " + age +
                ", weight = " + weight);
    } // end print
} // end class MouseShortcut

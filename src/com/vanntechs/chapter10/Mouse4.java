package com.vanntechs.chapter10;

public class Mouse4
{
    private static int mouseCount;
    private static Mouse4 youngestMouse;
    private int age;

    public Mouse4()
    {
        Mouse4.mouseCount++;
        Mouse4.youngestMouse = this;
    }

    public static void printMouseCount()
    {
        System.out.println("Total mice = " + Mouse4.mouseCount);
    }

    public void olderByOneDay()
    {
        this.age++;
    }

    //*******************************************************

    public static void main(String[] args)
    {
        Mouse4 pinky = new Mouse4();
        pinky.olderByOneDay();
        Mouse4.printMouseCount();
    }
} // end class Mouse4
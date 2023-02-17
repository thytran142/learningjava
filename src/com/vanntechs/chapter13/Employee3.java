package com.vanntechs.chapter13;

/***************************************************************
 * Employee3.java
 * Dean & Dean
 *
 * This abstract class describes employees and it includes
 * social-security tax calculation.
 ***************************************************************/

public abstract class Employee3
{
    public abstract double getPay();
    private String name;
    private final static double FICA_TAX_RATE = 0.08; // fraction
    private final static double FICA_MAX = 90000;     // dollars
    private double ytdIncome;        // total year-to-date income

    //************************************************************

    public Employee3(String name)
    {
        this.name = name;
    }

    //************************************************************

    public void printPay(int date)
    {
        System.out.printf("%2d %10s: %8.2f\n",
                date, name, getPay());
    } // end printPay

    //************************************************************

    protected double getFICA(double pay)
    {
        double increment, tax;

        ytdIncome += pay;
        increment = FICA_MAX - ytdIncome;
        tax = FICA_TAX_RATE *
                (pay < increment ? pay : (increment > 0 ? increment : 0));
        return tax;
    } // end getFICA
} // end class Employee3
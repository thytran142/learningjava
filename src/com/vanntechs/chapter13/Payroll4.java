package com.vanntechs.chapter13;

/**************************************************************
 * Payroll4.java
 * Dean & Dean
 *
 * This class hires and pays employees some kind of commission.
 **************************************************************/

public class Payroll4
{

    public static void main(String[] args)
    {
        Commission[] people = new Commission[100];

        people[0] = new Commissioned("Glen");
        people[1] = new SalariedAndCommissioned("Carol", 24000);

        people[0].addSales(15000);
        people[1].addSales(15000);
        for (int i=0; i<people.length && people[i] != null; i++)
        {
            ((Employee2) people[i]).printPay(15);
        }
    } // end main
} // end class Payroll4

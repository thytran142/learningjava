package com.vanntechs.chapter12;

/*******************************************************
 * DealershipDriver2.java
 * Dean & Dean
 *
 * This class demonstrates car dealership composition.
 *******************************************************/

public class DealershipDriver2
{
    public static void main(String[] args)
    {
        Manager2 ryne = new Manager2("Ryne Mendez");
        SalesPerson2 nicole = new SalesPerson2("Nicole Betz");
        SalesPerson2 vince = new SalesPerson2("Vince Sola");
        Dealership2 dealership =
                new Dealership2("OK Used Cars", ryne);

        dealership.addPerson(nicole);
        dealership.addPerson(vince);
        dealership.addCar(new Car("GMC"));
        dealership.addCar(new Car("Yugo"));
        dealership.addCar(new Car("Dodge"));
        dealership.printStatus();
    } // end main
} // end DealershipDriver2 class
package com.vanntechs.chapter4;

import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        int number;
        double factorial = 1.0;

        System.out.print("Enter a whole number: ");
        number = stdIn.nextInt();

        for (int i=2; i<=number; i++)
        {
            factorial *= i;
        }

        System.out.println(number + "! = " + factorial);
    }
}

package com.vanntechs.chapter4;

/************************************************************
 * TruthTable.java
 * Dean & Dean
 *
 * This proves equivalence of two boolean expressions
 ************************************************************/

public class TruthTable
{
    public static void main(String[] args)
    {
        boolean x = false;
        boolean y = false;
        boolean result1, result2;

        System.out.println("x\ty\tresult1\tresult2");
        for (int i=0; i<2; i++)
        {
            for (int j=0; j<2; j++)
            {
                result1 = !(x || y);
                result2 = !x && !y;
                System.out.println(x + "\t" + y +
                        "\t" + result1 + "\t" + result2);
                y = !y;
            } // end for j
            x = !x;
        } // end for i
    } // end main
} // end TruthTable class
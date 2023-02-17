package com.vanntechs.chapter3;

public class HelloGoodbye
{
    public static void main(String[] args)
    {
        String s1;
        String s2 = "and I say hello";

        s1 = "goodbye";
        s1 = "You say " + s1;
        s1 += ", " + s2 + '.';
        System.out.println(s1);
    }
}

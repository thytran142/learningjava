package com.vanntechs.chapter3;

public class Horsefly
{
    public static void main(String[] args)
    {
        String animal1 = "Horse";
        String animal2 = "Fly";
        String newCreature;

        newCreature = animal1 + animal2;
        System.out.println(newCreature.equals("HorseFly"));
        System.out.println(newCreature.equals("horsefly"));
    }
}
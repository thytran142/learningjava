package com.vanntechs.chapter10;

/**************************************************************
 * Agent.java
 * Dean & Dean
 *
 * Class that describes agents that collect quantitative values.
 **************************************************************/

import java.util.Scanner;

public class Agent
{
    private static Agent listOfAgents = null; // head of list
    private final String NAME;
    private double value = 0.0;
    private Agent nextAgent; // next in list

    //***********************************************************

    public Agent(String name)
    {
        this.NAME = name;
        this.nextAgent = listOfAgents;
        listOfAgents = this;
    } // end constructor

    //***********************************************************

    private double getValue()
    {
        return this.value;
    }

    //***********************************************************

    private void addValue()
    {
        Scanner stdIn = new Scanner(System.in);
        System.out.printf("Enter %s's contribution: ", this.NAME );
        this.value += stdIn.nextDouble();
    } // end addValue

    //**********************************************************

    public static double getAllValues()
    {
        double totalValue = 0.0;
        Agent agent = listOfAgents;
        while (agent != null)
        {
            totalValue += agent.getValue();
            agent = agent.nextAgent;
        }
        return totalValue;
    } // end getAllValues

    //**********************************************************

    public static void addAllValues()
    {
        Agent agent = listOfAgents;
        while (agent != null)
        {
            agent.addValue();
            agent = agent.nextAgent;
        }
    } // end addAllValues
} // end class Agent
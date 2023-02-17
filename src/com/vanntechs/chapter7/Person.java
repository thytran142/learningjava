package com.vanntechs.chapter7;

/***************************************************************
 * Person.java
 * Dean & Dean
 *
 * This stores, retrieves, and swaps a person's name.
 ***************************************************************/

public class Person
{
    private String name;

    //************************************************************

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    //************************************************************
    // This method swaps the names for two Person objects.

    public void swapPerson(Person otherPerson)
    {
        String temp;

        temp = otherPerson.name;
        otherPerson.name = this.name;
        this.name = temp;
    } // end swapPerson
} // end class Person

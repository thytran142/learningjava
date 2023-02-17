package com.vanntechs.chapter14;

/******************************************************
 * StudentList.java
 * Dean & Dean
 *
 * This class manages an ArrayList of students.
 ******************************************************/

import java.util.ArrayList;

public class StudentList
{
    ArrayList<String> students = new ArrayList<String>();

    //***************************************************

    public StudentList(String[] names)
    {
        for (int i=0; i<names.length; i++)
        {
            students.add(names[i]);
        }
    } // end constructor

    //***************************************************

    public void display()
    {
        for (int i=0; i<students.size(); i++)
        {
            System.out.print(students.get(i) + " ");
        }
        System.out.println();
    } // end display

    //***************************************************
/*
  // original code

  public void removeStudent(int index)
  {
    students.remove(index);
  } // end removeStudent
*/

/*
  // modification from Figure 14.10a

  public void removeStudent(int index)
  {
    try
    {
      students.remove(index);
    }
    catch (IndexOutOfBoundsException e)
    {
      System.out.println("Can't remove student because " +
        index + " is an invalid index position.");
    }
  } // end removeStudent
*/

    // modification from Figure 14.10b

    public void removeStudent(int index)
    {
        if (index >= 0 && index < students.size())
        {
            students.remove(index);
        }
        else
        {
            System.out.println("Can't remove student because " +
                    index + " is an invalid index position.");
        }
    } // end removeStudent
} // end StudentList

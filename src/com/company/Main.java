package com.company;

import java.io.IOException; //User input Exception handling
import java.util.Scanner; // For User input
import java.util.concurrent.TimeUnit; //Slowing down the console
import com.company.AllShapes.*;
import com.company.Shape;

import static com.company.Shape.afterShapeDisplayDecision;


public class Main
{
    //TODO: commit with this progress
    // Organized project into seperate packages+Class files
    //  Added ShapeActions interface
    //   fixed errors to start looking for bugs in console window
    //    Commented out certain shapes and left
    //      Created more methods in the shape class to add modularity
    //       Made big push on box class


    //TODO: Create Test
    public static void main(String[] args)
    {
        //Messages to user---------------------------------------------------------------
        //final because the message should remain const
        final String greeting = "Hello, Welcome To Your Shape Generator! \n\n " +
                "Press Any Key To Continue";
        System.out.println(greeting);

        //Clearing the console-----------------------------------------------------------
        try
        {
            System.in.read();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        System.console().flush();


        //Displaying possible shapes to user--------------------------------------------

        Shape DisplayShape = new Shape();
        //TODO: Try to put two lines of code in one
        //Attempt 1
        DisplayShape.getDisplayShape().drawThisShape(DisplayShape.grabSizeParameters());
        //DisplayShape.drawThisShape(DisplayShape.grabSizeParameters());


        //Asking user to go Back to the main screen or exit (RECURSION)-----------------
        //Waiting 3 seconds after Shape is displayed and display message----------------
        //TODO: Multithread this with

        try
        {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        afterShapeDisplayDecision();
    }


}

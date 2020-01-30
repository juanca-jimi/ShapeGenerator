package com.company;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static com.company.Shape.afterShapeDisplayDecision;


public class Main
{
    //TODO: Create Test
    public static void main(String[] args)
    {
        greetUser();
        clearMyConsole();
        //Displaying possible shapes to user-----------------------------------
        Shape DisplayShape = new Shape();
        DisplayShape.getDisplayShape().drawThisShape(DisplayShape.grabSizeParameters());
        pauseMyConsoleOperations();
        //Asking user to go Back to the main screen or exit (RECURSION)--------
        afterShapeDisplayDecision();
    }

    //----------------------------------------------------------------------------------
    private static  void greetUser()
    {
        //Message to user---------------------------------------------------------------
        //final because the message should remain const
        final String greeting = "Hello, Welcome To Your Shape Generator! \n\n " + "Press Any Key To Continue";
        System.out.println(greeting);
    }
    private static void clearMyConsole()
    {
        //Clearing the console-----------------------------------------------------------
        try { System.in.read(); }
        catch (IOException e) { e.printStackTrace(); }
        System.console().flush();
    }
    private static void pauseMyConsoleOperations()
    {
        //Waiting 5 seconds after Shape is displayed and display message----------------
        //TODO: Multithread this with
        try { TimeUnit.SECONDS.sleep(5); }
        catch (InterruptedException e) { e.printStackTrace(); }
    }
}

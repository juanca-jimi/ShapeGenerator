package com.company;

import com.company.AllShapes.Shape;

import java.io.IOException; // Exception handling class
import java.util.concurrent.TimeUnit;
import static com.company.AllShapes.Shape.afterShapeDisplayDecision;

public class Main
{
    //TODO: Create Test
    public static void main(String[] args)
    {

        //greetUser();
        //TODO: fix this
        //clearMyConsole();
        //Displaying possible shapes to user
        Shape DisplayShape = new Shape();
        DisplayShape.getDisplayShape().drawThisShape(DisplayShape.grabSizeParameters());
        pauseMyConsoleOperations();
        //Asking user to go Back to the main screen or exit
        afterShapeDisplayDecision();

    }



    //----------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------
    //Message to user
    private static void greetUser()
    {
        //final because the message should remain const
        final String greeting = "Hello, Welcome To Your Shape Generator! \n\n " +
                "Press Any Key To Continue";
        System.out.println(greeting);
    }

    //Clearing the console
    private static void clearMyConsole()
    {
        try { System.in.read(); }
        catch (IOException e) { e.printStackTrace(); }
        System.console().flush();
    }

    //Waiting 3 seconds between where shape is displayed and user makes next choice
    private static void pauseMyConsoleOperations()
    {
        //TODO: Multithread this with drawing method
        try { TimeUnit.SECONDS.sleep(3); }
        catch (InterruptedException e) { e.printStackTrace(); }
    }
}

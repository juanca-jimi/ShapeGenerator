package com.company;

import com.company.AllShapes.Shape;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static com.company.AllShapes.Shape.afterShapeDisplayDecision;

public class Main
{
    //TODO: Create Test
    public static void main(String[] args)
    {
        //Displaying possible shapes to user
        Shape DisplayShape = new Shape();
        DisplayShape = DisplayShape.getDisplayShape();
        DisplayShape.drawThisShape(DisplayShape.grabSizeParameters());
        HistoricalShapes AppHistorical = new HistoricalShapes(DisplayShape);
        pauseMyConsoleOperations(4);
        //Asking user to go Back to the main screen or exit
        afterShapeDisplayDecision(AppHistorical);
    }

    //----------------------------------------------------------------------------------
    //---------------------------------------------------------------------------------
    //Clearing the console
    private static void clearMyConsole()
    {
        try { System.in.read(); }
        catch (IOException e) { e.printStackTrace(); }
        System.console().flush();
    }
    //Waiting 4 seconds between where shape is displayed and user makes next choice
    //public to use in Shape class
    public static void pauseMyConsoleOperations(int timeOut)
    {
        //TODO: Multithread this with drawing method
        try { TimeUnit.SECONDS.sleep(timeOut); }
        catch (InterruptedException e) { e.printStackTrace(); }
    }
}

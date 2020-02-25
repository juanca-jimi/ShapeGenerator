package com.company;

import com.company.Shapes.Shape;
import com.company.Shapes.ShapeLog;

import java.util.concurrent.TimeUnit;

import static com.company.Shapes.Shape.afterShapeDisplayDecision;
import static com.company.Shapes.Shape.getDisplayShape;

public class Main
{
    //TODO: Create Test
    public static ShapeLog AppLog = new ShapeLog();
    public static void main(String[] args)
    {
        Shape DisplayShape = getDisplayShape();
        DisplayShape.drawThisShape(DisplayShape.grabSizeParameters());
        pauseMyConsoleOperations(2);
        afterShapeDisplayDecision(DisplayShape);
    }

    //----------------------------------------------------------------------------------
    //Waiting x=timeOut seconds between where shape is displayed and user makes next choice
    //public to use in Shape class
    public static void pauseMyConsoleOperations(int timeOut)
    {
        try { TimeUnit.SECONDS.sleep(timeOut); }
        catch (InterruptedException e) { e.printStackTrace(); }
    }
}

import java.awt.*;
import java.util.Scanner; //For user input

public abstract class MyShape
{

    public object getDisplayShape()
    {
        System.out.println("Your possible shapes are listed below. \n " +
                "Please select your shape by the number assigned to it.");


    }
    //TODO: Create method that calls all classes that inherit from Shape and display that to the user
        for (:
                )
    {

    }

    //TODO: Create method that allow user to return that object


    public static void afterShapeDisplayDecision()
    {
        final String decisionQuestion = "If you would like to exit the program ";
        System.out.println();

        //TODO: if user enters 1 exit program

        //TODO: if user enters 2 return to getDisplayShape method

    }

    //Methods from classes that inherit from this class must have...
    //  1. Draw shape
    protected abstract void drawThisShape();
    //  2. Grab size parameters
    protected abstract var grabSizeParameters();

}

//Inheriting Classes----------------------------------------------------------------------------------------------------
class Box extends MyShape
{
    @Override
    protected void drawThisShape(int[] heightLength)
    {
        //TODO: using int[] in method parameter to draw shape
    }

    @Override
    protected int[] grabSizeParameters()
    {
        return new int[0];
    }
}
class BoxWithX extends MyShape
{

    @Override
    protected void drawThisShape()
    {
        //TODO: using int[] in method parameter to draw shape
    }

    @Override
    protected int[] grabSizeParameters()
    {
        return new int[0];
    }
}
class Circle extends MyShape
{
    @Override
    protected void drawThisShape(int circleRadius)
    {
        //TODO: using int[] in method parameter to draw shape
    }

    @Override
    protected int grabSizeParameters()
    {
        int radius = 1; //Initialized to circle of 1 *

        //TODO: Asking user for radius
        //Return Radius

        return radius;
    }
}

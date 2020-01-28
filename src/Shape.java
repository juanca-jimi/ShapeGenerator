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

    protected abstract void drawThisShape(int circleRadius);

    //Methods from classes that inherit from this class must have...
    //  1. Draw shape
    protected abstract void drawThisShape();
    //  2. Grab size parameters
    protected abstract var grabSizeParameters();
    //  3. Exception handling for grabbing size parameters
    protected abstract void sizeParametersExceptionHandling();


}

//Inheriting Classes----------------------------------------------------------------------------------------------------
class Box extends MyShape
{
    @Override
    protected void drawThisShape(int[] heightLength)
    {
        //TODO: Creating exception handling that will tell user if an X can be drawn with the sizeParameters given
        // Then give the user the option to return to the home screen or give different parameters!

        //TODO: using int[] in method parameter to draw shape
    }

    @Override
    protected void drawThisShape()
    {

    }

    @Override
    protected var grabSizeParameters()
    {


        var heightAndLength = [ 1 , 1 ];

        //TODO: Declaring int[] that will only store height and length. Array of two ints.


        return heightAndLength;
    }

    @Override
    protected void sizeParametersExceptionHandling()
    {

    }
}
class BoxWithX extends MyShape
{

    @Override
    protected void drawThisShape(int circleRadius)
    {

    }

    @Override
    protected void drawThisShape()
    {
        //TODO: Creating exception handling that will tell user if an X can be drawn with the sizeParameters given
        // Then give the user the option to return to the home screen or give different parameters!

        //TODO: using int[] in method parameter to draw shape

    }

    //TODO: make return type compatible
    @Override
    protected int[] grabSizeParameters()
    {
        //
        return new int[0];
    }

    @Override
    protected void sizeParametersExceptionHandling()
    {

    }

    private void drawBoxInside()
    {
        //TODO: Implement this method.
    }
}
class Circle extends MyShape
{

    @Override
    protected void drawThisShape(int circleRadius)
    {
        //TODO: Creating exception handling that will tell user if an X can be drawn with the sizeParameters given
        // Then give the user the option to return to the home screen or give different parameters!

        //TODO: using int[] in method parameter to draw shape
    }

    @Override
    protected void drawThisShape()
    {

    }

    //TODO: make return type compatible
    @Override
    protected int grabSizeParameters()
    {
        var radius = 1; //Initialized to circle of 1 *

        //TODO: Asking user for radius

        return radius;
    }

    @Override
    protected void sizeParametersExceptionHandling()
    {

    }
}

package com.company.AllShapes;

import com.company.Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Shape implements ShapeActions
{
    public Shape getDisplayShape()
    {
        System.out.println("Your possible shapes are listed below. \n " +
                "Please select your shape by the number assigned to it.");

        ArrayList<Shape> myShapes =  possibleShapes();
        possibleShapesMenu(myShapes);
        Scanner usersShapeChoice = new Scanner(System.in);

        int properIndex = usersShapeChoice.nextInt() - 1;
        //TODO: Implement Exception Handling

        return myShapes.get(properIndex);
    }

    private static void possibleShapesMenu(ArrayList shapesList)
    {
        //Displaying all implemented Shapes to user
        for ( int shapes = 1; shapes <= shapesList.size() ; shapes++)
        {
            //Displaying numbers. + name of shape associated with the class

            //EX: 1. Triangle
            //    2. Circle

            String shapeDisplay = shapes + ". " + shapesList.getClass();
            System.out.println( shapeDisplay );
        }

        //Message to user
        final String prompt = "Please chose Shape by entering the number associated with it and press enter";
        System.out.println(prompt);
    }

    //Method that stores all classes that inherit from Shape
    private static ArrayList possibleShapes()
    {
        //Initializing returning Arraylist<>
        ArrayList<Shape> myPossibleShapes = new ArrayList<Shape>();

        //TODO: Gathering all classes that inherit from SHAPE and adding them to my Arraylist<>

        return myPossibleShapes;
    }

    public static void afterShapeDisplayDecision()
    {
        final String decisionQuestion = "If you would like to go exit press the X and then press Enter\n\n" +
                "Otherwise press any key to draw another shape and then press Enter";
        String[] args = new String[]{};

        //Message to user
        System.out.println(decisionQuestion);

        //Input from user
        Scanner decisionAnswer = new Scanner(System.in);
        char mainScreenOrExit = decisionAnswer.next().charAt(0);

        //Decision using user input
        if (mainScreenOrExit == 'X' || mainScreenOrExit == 'x') System.exit(0);
        else Main.main(args);
    }

    //Interface methods
    //TODO: Throw not implemented exception if these methods are called
    @Override public void drawThisShape(int[] dimensions) { }
    @Override public int[] grabSizeParameters() { return new int[]{};}
}
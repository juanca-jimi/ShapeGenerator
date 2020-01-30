package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;


public class Shape implements ShapeActions
{

    public Shape getDisplayShape()
    {
        System.out.println("Your possible shapes are listed below. \n " +
                "Please select your shape by the number assigned to it.");

        ArrayList<Shape> myShapes =  possibleShapes();
        possibleShapesMenu(myShapes);
        Scanner usersShapeChoice = new Scanner(System.in);

        //TODO: Implement Exception Handling
        return myShapes.get(usersShapeChoice.nextInt());
    }

    private static void possibleShapesMenu(ArrayList shapesList)
    {
        //TODO: Displaying Menu and returning that shape
        for ( int shapes = 1; shapes <= shapesList.size() ; shapes++)
        {
            //Displaying numbers. + name of shape associated with the class
            //EX: 1. Triangle
            //    2. Circle
            String Display = shapes + ". " + shapesList.getClass();
            System.out.println( Display );
        }

        final String prompt = "Please chose Shape by entering the number associated with it and press enter";

        System.out.println(prompt);
    }

    //TODO: Create method that stores all classes that inherit from Shape
    private static ArrayList possibleShapes()
    {
        ArrayList<Shape> myPossibleShapes = new ArrayList<Shape>();

        Reflections reflections = new Reflections("com.mycompany");
        Set<Class<? extends Shape>> classes = reflections.getSubTypesOf(MyInterface.class);

        return myPossibleShapes;
    }


    public static void afterShapeDisplayDecision()
    {
        final String decisionQuestion = "If you would like to go exit press the X and then press Enter\n\n" +
                "Otherwise press any key to draw another shape and then press Enter";

        System.out.println(decisionQuestion);

        Scanner decisionAnswer = new Scanner(System.in);
        char mainScreenOrExit = decisionAnswer.next().charAt(0);
        if (mainScreenOrExit == 'X' || mainScreenOrExit == 'x') System.exit(0);

        //TODO: Ask someone what should go in a main() method parameter
        //else Main.main();
    }


    @Override public void drawThisShape(int[] dimensions) { }
    @Override public int[] grabSizeParameters() { return new int[]{};}
    //@Override public void sizeParametersExceptionHandling(){}
}
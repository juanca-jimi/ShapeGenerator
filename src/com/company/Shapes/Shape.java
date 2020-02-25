package com.company.Shapes;

import com.company.Main;
import com.company.Shapes.ImplementedShapes.EmptyBox;
import com.company.Shapes.ImplementedShapes.EmptyIsoscelesTriangle;
import com.company.Shapes.ImplementedShapes.FilledBox;
import com.company.Shapes.ImplementedShapes.FilledIsoscelesTriangle;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static com.company.Main.AppLog;
import static com.company.Main.pauseMyConsoleOperations;

public abstract class Shape implements ShapeActions
{
    protected int[] currentShapeSize = {1,1,0};
    protected int numberOfIndexes = 1;
    protected String myDimensionName = "";
    protected String myDrawing = "";

    public static Shape getDisplayShape()
    {
        System.out.println("Your possible shapes are listed below. \n" +
                "Please select your shape by the number assigned to it.\n\n");

        ArrayList<Shape> myShapes =  possibleShapes();
        int exitNumber = possibleShapesMenu(myShapes);
        Scanner usersShapeChoice = new Scanner(System.in);
        usersShapeChoice.nextLine();


        //Handling exceptions
        if (!usersShapeChoice.hasNextInt() || usersShapeChoice.nextInt() < 1 || usersShapeChoice.nextInt() > 5)
        {
            System.out.println("Error.");
            //tODO: Add recursion
        }

        if (usersShapeChoice.nextInt() == exitNumber) exitApp();
        int properIndex = usersShapeChoice.nextInt() - 1;


        return myShapes.get(properIndex);
    }

    private static int possibleShapesMenu(ArrayList<Shape> shapesList)
    {
        var exitNumber = shapesList.size() + 1;
        //Displaying all implemented Shapes to user
        for ( int shapes = 1; shapes <= shapesList.size() ; shapes++)
        {
            //Displaying numbers. + name of shape associated with the class

            //EX: 1. Triangle
            //    2. Circle

            String shapeDisplay = shapes + ". " + classDisplayName(shapesList.get(shapes-1).toString());
            System.out.println( shapeDisplay );
            if (shapes == shapesList.size())
            {
                System.out.println( ++shapes + ". Exit");
                break;
            }
        }


        //Message to user
        final String prompt = "\nPlease choose your shape by entering the number associated with it and press enter\n";
        System.out.println(prompt);


        return exitNumber;
    }

    //Method that stores all classes that inherit from Shape
    private static ArrayList possibleShapes()
    {
        //Initializing returning Arraylist<>
        ArrayList<Shape> myPossibleShapes = new ArrayList<Shape>(20);

        //TODO: Gathering all classes that inherit from SHAPE at compile time and adding them to my Arraylist<>

        myPossibleShapes.add(0, new EmptyBox());
        myPossibleShapes.add(1, new FilledBox());
        myPossibleShapes.add(2, new FilledIsoscelesTriangle());
        myPossibleShapes.add(3, new EmptyIsoscelesTriangle());

        return myPossibleShapes;
    }

    public static void afterShapeDisplayDecision(Shape Shape)
    {
        //To call main method
        String[] args = new String[]{};
        System.out.println("If you would like to go exit press the X and then press Enter\n" +
                           "If you would like to redraw this shape enter \"1\"\n" +
                           "Otherwise press any key to draw another shape and then press Enter");

        //Retrieving input from user
        Scanner decisionAnswer = new Scanner(System.in);
        char mainScreenRedrawOrExit = decisionAnswer.next().charAt(0);

        //Decision using user input
        if (mainScreenRedrawOrExit == 'X' || mainScreenRedrawOrExit == 'x') exitApp();
        else if (mainScreenRedrawOrExit == '1')
        {
            Shape.drawThisShape(Shape.grabSizeParameters());
            afterShapeDisplayDecision(Shape);
        }
        else Main.main(args);
    }

    public static String classDisplayName(String packageClassName)
    {
        //Removing "Com.Company.AllShapes..."
        packageClassName = packageClassName.substring(37);

        //removing "@........."
        StringBuilder newString = new StringBuilder();
        for (int index = 0; index < packageClassName.length(); index++)
        {
            if (packageClassName.charAt(index) == '@') {  break;}
            char thisChar = packageClassName.charAt(index);
            newString.append(thisChar);
        }
        packageClassName = newString.toString();

        //From Pascal Case to regular notation
        StringBuilder fixedPackageClassName = new StringBuilder();
        for (int index = 0; index < packageClassName.length(); index++)
        {
            if (Character.isUpperCase(packageClassName.charAt(index)) && (index != 0)) fixedPackageClassName.append(' ');
            fixedPackageClassName.append(packageClassName.charAt(index));
        }

        return fixedPackageClassName.toString();
    }

    //overloaded method
    public static String classDisplayName(String packageClassName, int removePreviousChars)
    {
        //Removing "Com.Company.AllShapes..."
        packageClassName = packageClassName.substring(removePreviousChars);

        //removing "@........."
        StringBuilder newString = new StringBuilder();
        for (int index = 0; index < packageClassName.length(); index++)
        {
            if (packageClassName.charAt(index) == '@') {  break;}
            char thisChar = packageClassName.charAt(index);
            newString.append(thisChar);
        }
        packageClassName = newString.toString();

        //From Pascal Case to regular notation
        StringBuilder fixedPackageClassName = new StringBuilder();
        for (int index = 0; index < packageClassName.length(); index++)
        {
            if (Character.isUpperCase(packageClassName.charAt(index)) && (index != 0)) fixedPackageClassName.append(' ');
            fixedPackageClassName.append(packageClassName.charAt(index));
        }

        return fixedPackageClassName.toString();
    }

    private static void exitApp()
    {
        System.out.println("Saving your session to a file on the desktop...");
        pauseMyConsoleOperations(3);
        try {
            AppLog.createFileOutput();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }
}
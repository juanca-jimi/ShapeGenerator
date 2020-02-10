package com.company.AllShapes;

import com.company.HistoricalShapes;

import java.util.ArrayList;
import java.util.Scanner;

public class Shape implements ShapeActions
{

    public Shape getDisplayShape()
    {
        System.out.println("Your possible shapes are listed below. \n" +
                "Please select your shape by the number assigned to it.\n\n");

        ArrayList<Shape> myShapes =  possibleShapes();
        possibleShapesMenu(myShapes);
        Scanner usersShapeChoice = new Scanner(System.in);

        int properIndex = usersShapeChoice.nextInt() - 1;
        //TODO: Implement Exception Handling

        return myShapes.get(properIndex);
    }

    private static void possibleShapesMenu(ArrayList<Shape> shapesList)
    {
        //Displaying all implemented Shapes to user
        for ( int shapes = 1; shapes <= shapesList.size() ; shapes++)
        {
            //Displaying numbers. + name of shape associated with the class

            //EX: 1. Triangle
            //    2. Circle

            String shapeDisplay = shapes + ". " + classDisplayName(shapesList.get(shapes-1).toString());
            System.out.println( shapeDisplay );
        }

        //Message to user
        final String prompt = "\nPlease choose your shape by entering the number associated with it and press enter\n";
        System.out.println(prompt);
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

    public static void afterShapeDisplayDecision(HistoricalShapes thisHistorical)
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
        /*if (mainScreenOrExit == 'X' || mainScreenOrExit == 'x')
        {
            thisHistorical.displayHistorical(thisHistorical);
            pauseMyConsoleOperations();
            System.exit(0);
        };
        else Main.main(args);*/
    }

    private static String classDisplayName(String packageClassName)
    {
        //Removing "Com.Company.AllShapes."
        packageClassName = packageClassName.substring(22);

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

    @Override
    public void addToHistoricalShape()
    {

    }

    //Interface methods
    //TODO: Throw not implemented exception if these methods are called
    @Override public void drawThisShape(int[] dimensions) { }
    @Override public int[] grabSizeParameters() { return new int[]{};}


}
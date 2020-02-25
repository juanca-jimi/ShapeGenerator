package com.company.Shapes.ImplementedShapes;

import com.company.Shapes.Shape;

import java.util.Scanner;

import static com.company.Main.AppLog;

public class EmptyBox extends Shape
{
    @Override public void drawThisShape(int[] heightAndWidth)
    {
        //TODO: Creating exception handling that will tell user if an X can be drawn with the sizeParameters given
        // Then give the user the option to return to the home screen or give different parameters!
        //Using int[] in method parameter to draw shape, the first index is height and second index [1] is width\
        StringBuilder MyDrawing = new StringBuilder();
        for(int row = 1; row <= heightAndWidth[0]; row++)
        {
                for(int column = 1; column <= heightAndWidth[1]; column++)
                {
                    //Bottom and top row
                    if (row == 1 || row == heightAndWidth[0])
                    {
                        MyDrawing.append("*");
                        System.out.print("*");
                    }

                    //left and right perimeter
                    else if (column == 1 || column == heightAndWidth[1])
                    {
                        MyDrawing.append("*");
                        System.out.print("*");
                    }

                    //Inner box

                    else
                        {
                        MyDrawing.append(" ");
                        System.out.print(" ");
                        }
                }

                //Starting a new row
                System.out.println();
        }
        myDrawing = MyDrawing.toString();
        addToShapeLog(heightAndWidth);
    }

    @Override public int[] grabSizeParameters()
    {
        //Declaring int[] that will only store height and length. Array of two ints.
        //[0] is height --- [1] is width
        int[] heightAndWidth= new int[]{ 1 , 1 };

        System.out.println("Enter your box's height. 1-50.");
        Scanner Height = new Scanner(System.in);
        sizeParametersExceptionHandling(Height);
        heightAndWidth[0] = Height.nextInt();
        System.out.println("Enter your box's width. 1-50.");
        Scanner Width = new Scanner(System.in);
        sizeParametersExceptionHandling(Width);
        heightAndWidth[1] = Width.nextInt();

        return heightAndWidth;
    }

    @Override public void sizeParametersExceptionHandling(Scanner input)
    {
        if (!input.hasNextInt()) {System.out.println( "Error. Try Again.\n" ); grabSizeParameters();}
        if (input.nextInt() < 1 || input.nextInt() > 50)
        {
            System.out.println("Input not valid. Try again.\n");
            grabSizeParameters();
        }
    }

    @Override public void addToShapeLog(int[] heightAndWidth)
    {
        currentShapeSize[0] = heightAndWidth[0];
        currentShapeSize[1] = heightAndWidth[1];
        numberOfIndexes = 2;
        myDimensionName = "Height-Width\n------------------------\n";
        AppLog.log(this);
    }
}

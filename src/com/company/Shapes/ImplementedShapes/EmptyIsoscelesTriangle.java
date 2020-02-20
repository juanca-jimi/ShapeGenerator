package com.company.Shapes.ImplementedShapes;

import com.company.Shapes.Shape;

import java.util.Scanner;

import static com.company.Main.AppLog;

public class EmptyIsoscelesTriangle extends Shape
{
    @Override public void drawThisShape(int[] baseAndHeight)
    {
        //TODO: Creating exception handling that will tell user if an X can be drawn with the sizeParameters given
        // Then give the user the option to return to the home screen or give different parameters!
        //Using int[] in method parameter, the first index [0] is base length and second index [1] is height
        StringBuilder MyDrawing = new StringBuilder();
        for(int row = 1; row <= baseAndHeight[0]; row++)
        {
                for(int column = 1; column <= row; column++)
                {
                    //outer triangle
                    if (column == 1 || column == row)
                    {
                        MyDrawing.append("*");
                        System.out.print("*");
                    }

                    //bottom row
                    else if (row == baseAndHeight[0])
                    {
                        MyDrawing.append("*");
                        System.out.print("*");
                    }

                    //inner triangle
                    else
                        {
                            MyDrawing.append(" ");
                            System.out.print(" ");
                        }
                }
                //Starting a new row
                MyDrawing.append("\n");
                System.out.println();
        }
        myDrawing = MyDrawing.toString();
        addToShapeLog(baseAndHeight);
    }
    @Override public int[] grabSizeParameters()
    {
        //Declaring int[] that will only store height and length. Array of two ints.
        //[0] is height --- [1] is width
        var baseAndHeight= new int[]{ 2 };

        //TODO: Implement exception handling
        System.out.println("Enter a whole number greater than 1 and less than 25 for your triangle's base & height");
        Scanner BaseAndHeight = new Scanner(System.in);
        sizeParametersExceptionHandling(BaseAndHeight);
        baseAndHeight[0] = BaseAndHeight.nextInt();

        return baseAndHeight;
    }

    @Override public void sizeParametersExceptionHandling(Scanner input)
    {
        if (!input.hasNextInt()) {System.out.println( "Error. Try Again.\n" ); grabSizeParameters();}
        if (input.nextInt() < 2 || input.nextInt() > 25)
        {
            System.out.println("Input not valid. Try again.\n");
            grabSizeParameters();
        }
    }

    @Override public void addToShapeLog(int[] baseAndHeight)
    {
        currentShapeSize[0] = baseAndHeight[0];
        numberOfIndexes = 1;
        myDimensionName = "Base And Height\n------------------------\n";
        AppLog.log(this);
    }
}


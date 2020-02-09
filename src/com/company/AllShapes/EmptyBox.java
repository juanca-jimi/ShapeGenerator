package com.company.AllShapes;

import java.util.Scanner;

public class EmptyBox extends Shape
{
    @Override
    public void drawThisShape(int[] heightAndWidth)
    {
        //TODO: Creating exception handling that will tell user if an X can be drawn with the sizeParameters given
        // Then give the user the option to return to the home screen or give different parameters!
        //Using int[] in method parameter to draw shape, the first index is height and second index [1] is width
        for(int row = 1; row <= heightAndWidth[0]; row++)
        {
                for(int column = 1; column <= heightAndWidth[1]; column++)
                {
                    //Printing out row of asterisk
                    //Print out asterisk in every column of the row
                    if (row == 1 || row == heightAndWidth[0])
                    {
                        System.out.print("*");
                    }

                    //Print out perimeter of the box
                    else if (column == 1 || column == heightAndWidth[1])
                    {
                        System.out.println("*");
                    }
                }

                //Starting a new column
                System.out.print("\n");
        }
    }

    @Override
    public int[] grabSizeParameters()
    {
        //Declaring int[] that will only store height and length. Array of two ints.
        //[0] is height --- [1] is width
        int[] heightAndWidth= new int[]{ 1 , 1 };

        //TODO: Implement exception handling
        System.out.println("Enter your box's height");
        Scanner Height = new Scanner(System.in);
        heightAndWidth[0] = Height.nextInt();
        System.out.println("Enter your box's width");
        Scanner Width = new Scanner(System.in);
        heightAndWidth[1] = Width.nextInt();
        return heightAndWidth;
    }
}

package com.company.AllShapes;

import java.util.Scanner;

public class FilledIsoscelesTriangle extends Shape
{
    @Override
    public void drawThisShape(int[] baseAndHeight)
    {
        //TODO: Creating exception handling that will tell user if an X can be drawn with the sizeParameters given
        // Then give the user the option to return to the home screen or give different parameters!
        //Using int[] in method parameter, the first index [0] is base length and second index [1] is height
        for(int row = 1; row <= baseAndHeight[0]; row++)
        {
            {
                for(int column = 1; column <= row; column++)
                {
                    //Printing out row of asterisk
                    System.out.print("*");
                }
                //Starting a new row
                System.out.println();
            }
        }
    }

    @Override
    public int[] grabSizeParameters()
    {
        //Declaring int[] that will only store height and length. Array of two ints.
        //[0] is height --- [1] is width
        var baseAndHeight= new int[]{ 2 };

        //TODO: Implement exception handling
        System.out.println("Enter a whole number greater than 2 for your triangle's base & height");
        Scanner BaseAndHeight = new Scanner(System.in);
        baseAndHeight[0] = BaseAndHeight.nextInt();
        return baseAndHeight;
    }
}


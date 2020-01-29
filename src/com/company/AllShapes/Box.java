package com.company.AllShapes;

import com.company.Shape;

import java.util.Scanner;

public class Box extends Shape
{
    //TODO: Find a way to pass int[] heightAndWidth to this methods parameters
    @Override
    public void drawThisShape(int[] heightAndWidth)
    {
        //TODO: Creating exception handling that will tell user if an X can be drawn with the sizeParameters given
        // Then give the user the option to return to the home screen or give different parameters!

        //TODO: using int[] in method parameter to draw shape

        for(int height = 1; height <= heightAndWidth[0]; height++)
        {

            //for top of box
            if(heightAndWidth[0] >1 && height == 1 )
            {
                for(int row = 1; row <= heightAndWidth[1]; row++)
                {

                }
            }
            //for bottom of box
            if(heightAndWidth[0] > 1 && height == heightAndWidth[1] )
            {
                for(int row = 1; row <= heightAndWidth[1]; row++)
                {
                    System.out.print("*");
                }
            }
        }


    }

    @Override
    public int[] grabSizeParameters()
    {
        //Declaring int[] that will only store height and length. Array of two ints.
        //[0] is height --- [1] is width
        var heightAndWidth= new int[]{ 1 , 1 };

        //TODO: Implement exception handling
        Scanner Height = new Scanner(System.in);
        heightAndWidth[0] = Height.nextInt();
        Scanner Width = new Scanner(System.in);
        heightAndWidth[1] = Width.nextInt();
        return heightAndWidth;
    }

    /*@Override
    public void sizeParametersExceptionHandling()
    {

    }*/
}

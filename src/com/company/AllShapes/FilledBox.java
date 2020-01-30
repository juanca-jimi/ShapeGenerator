package com.company.AllShapes;

import com.company.Shape;
import java.util.Scanner;

public class FilledBox extends Shape
{
    @Override
    public void drawThisShape(int[] heightAndWidth)
    {
        //TODO: Creating exception handling that will tell user if an X can be drawn with the sizeParameters given
        // Then give the user the option to return to the home screen or give different parameters!
        //Using int[] in method parameter to draw shape, the first index is height and second index [1] is width
        for(int height = 1; height <= heightAndWidth[0]; height++)
        {
            if(height <= heightAndWidth[1])
            {
                for(int row = 1; row <= heightAndWidth[1]; row++)
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

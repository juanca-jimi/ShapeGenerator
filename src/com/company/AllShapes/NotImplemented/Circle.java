/*
package com.company.AllShapes;

import java.util.Scanner;

class Circle extends Shape
{
    //Find a way to pass int circleRadius to this methods parameters
    @Override
    public void drawThisShape(int[] radius)
    {
        //TODO: Creating exception handling that will tell user if an X can be drawn with the sizeParameters given
        // Then give the user the option to return to the home screen or give different parameters!
        for (int row=1; row <= radius[0]; row++)
        {
            for (int charSpace = 1; charSpace <= radius[0] ; charSpace++)
            {
                if ((radius[0]/charSpace) >= 1 && (radius[0]/charSpace) <= -1) { System.out.print("*"); }
                else System.out.print(" ");
            }

            //New row
            System.out.println();
        }

    }


    //TODO: make return type compatible
    @Override
    public int[] grabSizeParameters()
    {
        int[] radius = new int[]{1}; //Initialized to circle of 1 *

        //TODO: Implement exception handling
        System.out.println("Enter a whole number greater than 2b for your circle's radius");
        Scanner UserRadius = new Scanner(System.in);
        radius[0] = UserRadius.nextInt();

        //For HistoricalShapes
        currentShapeSize[0] = radius[0];

        return radius;
    }

    */
/*@Override
    public void sizeParametersExceptionHandling()
    {

    }*//*

}*/

/*package com.company.AllShapes;

import com.company.AllShapes.Shape;
import java.util.Scanner;

public class FilledTriangle extends Shape
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
                for(int column = 1; column <= baseAndHeight[1]; column++)
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
        var baseAndHeight= new int[]{ 2 , 1 };

        //TODO: Implement exception handling
        System.out.println("Enter your triangle's base");
        Scanner Base = new Scanner(System.in);
        baseAndHeight[0] = Base.nextInt();
        System.out.println("Enter your triangle's height");
        Scanner Height = new Scanner(System.in);
        baseAndHeight[1] = Height.nextInt();
        return baseAndHeight;
    }
}
 */

package com.company.Shapes;

import java.util.Scanner;

interface ShapeActions
{
    //--------------------------------------------------------------------------------------------------------
    //  1. Draw shape
    void drawThisShape(int[] dimensions);
    //--------------------------------------------------------------------------------------------------------
    //  2. Grab size parameters
    int[] grabSizeParameters(); //Storing into int[] and each shape will easily store it's respective values
    //--------------------------------------------------------------------------------------------------------
    //  3. Exception handling for grabbing size parameters
    void sizeParametersExceptionHandling(Scanner input);
    //--------------------------------------------------------------------------------------------------------
    //  4. Adding to historical shapes
    void addToShapeLog(int[] dimension);
    //--------------------------------------------------------------------------------------------------------
}

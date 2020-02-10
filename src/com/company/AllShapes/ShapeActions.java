package com.company.AllShapes;

//ShapeActions Interface for MyShape------------------------------------------------------------------------------------
public interface ShapeActions
{

    //Methods from classes that inherit from this class must have...
    //  1. Draw shape
    void drawThisShape(int[] dimensions);

    //  2. Grab size parameters
    int[] grabSizeParameters(); //Storing into int[] and each shape will easily store it's respective values

    //  TODO: 3. Exception handling for grabbing size parameters
    //void sizeParametersExceptionHandling();

    //  TODO: 4. Redraw THIS shape again with different/same dimensions
    //void redrawThisShape();

    // 5. Adding to historical shapes
    void addToHistoricalShape();

    // 6. for historical shape
    int[] currentShapeSize = new int[]{1,1,0};
}

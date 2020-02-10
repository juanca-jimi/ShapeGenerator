package com.company.AllShapes;

import java.util.ArrayList;
import static com.company.AllShapes.Shape.classDisplayName;

public class HistoricalShapes
{
    int totalShapes = 0;
    ArrayList<Shape> MyShapes = new ArrayList<Shape>(100);
    ArrayList<int[]> MySizes = new ArrayList<int[]>(100);

    public HistoricalShapes(Shape currentShape)
    {
        saveShape(currentShape, totalShapes);
        saveSize(currentShape.currentShapeSize, totalShapes);
        totalShapes++;
    }

    private void saveShape(Shape ThisShape, int arrayListIndex)
    {
        MyShapes.add(arrayListIndex, ThisShape);
    }
    private void saveSize(int[] ShapeSize, int arrayListIndex)
    {
        MySizes.add(arrayListIndex, ShapeSize);
    }

    public static void displayHistorical(HistoricalShapes thisShape)
    {
        System.out.println("You created " + thisShape.totalShapes + "shapes!\n");
        for(Shape var : thisShape.MyShapes)
        {
            System.out.println
                    ( classDisplayName( thisShape.MyShapes.toString() ) + " of size: " +
                    thisShape.MySizes.toString());
        }
    }

}

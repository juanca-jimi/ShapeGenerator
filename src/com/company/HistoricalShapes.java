package com.company;

import com.company.AllShapes.Shape;

import java.util.ArrayList;

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

    /*public static void displayHistorical(HistoricalShapes thisHistorical)
    {
        System.out.println("You created " + thisHistorical.totalShapes + "shapes!\n");
        for(Shape var : thisHistorical.MyShapes)
        {
            System.out.println
                    ( classDisplayName(thisHistorical.MyShapes(thisHistorical.totalShapes-1)) +
                    thisHistorical.MySizes.toString());
        }
    }*/

}

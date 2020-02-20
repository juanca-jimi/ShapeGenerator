package com.company.Shapes;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ShapeLog
{
    //Storing the shape itself!
    //Terminate at the main menu

    private int totalShapes = 0;
    private ArrayList<Shape> AllMyShapes = new ArrayList<Shape>(100);
    private ArrayList<int[]> AllMySizes = new ArrayList<int[]>(100);
    private ArrayList<String> AllMyDrawings = new ArrayList<String>(100);
    private int[] AllMyParameterIndices = new int[100];

    public ShapeLog() { System.out.println("Your are starting to store your shapes...\n"); }

    public void log(Shape CurrentShape)
    {
        //Parameter where we pass in total shapes is the index of the arraylist in which our data is stored;
        AllMyShapes.add(totalShapes, CurrentShape);
        AllMySizes.add(totalShapes, CurrentShape.currentShapeSize);
        AllMyParameterIndices[totalShapes] = CurrentShape.numberOfIndexes;
        AllMyDrawings.add(totalShapes, CurrentShape.myDrawing);
        totalShapes++;
    }

    public void createFileOutput() throws IOException {
        FileWriter OutputFile = new FileWriter(" file.txt ", false);

        //TODO:
        //classDisplayName();
        //display exact number of indexes for that shape...
        //  for a circle it would only be the radius.. for a box it would be 0&1 because it has base and height
        //if (//Arraylist index is empty skip this) another option for this is a do while
        for (int arrayIndex = 0; arrayIndex < totalShapes; arrayIndex++)
        {

            System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
        }
        OutputFile.close();
    }
}

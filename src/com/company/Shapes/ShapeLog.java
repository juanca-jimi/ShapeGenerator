package com.company.Shapes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import static com.company.Shapes.Shape.classDisplayName;

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

    public void createFileOutput() throws IOException
    {
        File desktopFile = new File("C:\\Users\\jc7tb\\Desktop\\Juancas.txt" );
        desktopFile.setWritable(true);
        System.out.println(desktopFile.getAbsolutePath());
        FileWriter OutputToFile = new FileWriter( desktopFile, false);

        //display exact number of indexes for that shape...
        //  for a circle it would only be the radius.. for a box it would be 0&1 because it has base and height
        //if (//Arraylist index is empty skip this) another option for this is a do while
        for (int arrayIndex = 0; arrayIndex < totalShapes; arrayIndex++)
        {
            OutputToFile.write( classDisplayName(AllMyShapes.get(arrayIndex).toString(), 37) + "\n");
            OutputToFile.write(AllMyShapes.get(arrayIndex).myDimensionName);
            for (int sizeIndex = 0; sizeIndex < AllMyParameterIndices[arrayIndex]; sizeIndex++)
            {
                int[] sizes = AllMySizes.get(arrayIndex);
                OutputToFile.write(String.valueOf( sizes[sizeIndex]));
                if (!(sizeIndex+1 == AllMyParameterIndices[arrayIndex])) OutputToFile.write("  &  ");
            }
            OutputToFile.write("\n"+AllMyDrawings.get(arrayIndex) + "\n");
            OutputToFile.write("<><><><><><><><><><>\n\n");
        }
        OutputToFile.close();
    }
}

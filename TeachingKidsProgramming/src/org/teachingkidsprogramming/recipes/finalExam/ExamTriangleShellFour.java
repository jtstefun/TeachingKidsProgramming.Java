package org.teachingkidsprogramming.recipes.finalExam;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.windows.MessageBox;

public class ExamTriangleShellFour
{
  private static int length;
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    int shellSize = MessageBox.askForNumericalInput("Set Size of Shell");
    while (shellSize < 210)
    {
      MessageBox.showMessage("That Shell Size is too small");
      shellSize = MessageBox.askForNumericalInput("Please enter a Larger Shell Size");
    }
    else
    {
      for (int i = 0; i < shellSize; i++)
      {
        Tortoise.setPenColor(Colors.Purples.Purple);
        int largeLength = shellSize / 100;
        length += largeLength;
        int rotations = 12;
        if (largeLength < 0)
        {
          largeLength += 7;
        }
        drawTriangle(length);
        Tortoise.turn((360 * rotations) / shellSize);
      }
    }
    //    Repeat 
  }
  public static void drawTriangle(int length)
  {
    for (int i = 0; i < 3; i++)
    {
      Tortoise.move(length);
      Tortoise.turn(360 / 3.1);
    }
  }
  //------------- Recipe for drawTriangle
  //      Do the following 3 times 
  //          Move the tortoise the current length 
  //          Turn the tortoise 1/3.1 of 360 degrees 
  //    Repeat 
  //------------- End of drawTriangle recipe
}
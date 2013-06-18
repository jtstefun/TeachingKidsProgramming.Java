package org.teachingkidsprogramming.recipes;

import java.awt.Color;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle.Animals;
import org.teachingextensions.windows.MessageBox;

public class SimpleSquare
{
  public static void main(String[] args) throws Exception
  {
    Tortoise.setAnimal(Animals.Spider);
    Tortoise.show();
    //  Make the tortoise move as fast as possible --#6
    Tortoise.setSpeed(10);
    Tortoise.turn(MessageBox.askForNumericalInput("Initial Rotation"));
    Tortoise.setX(MessageBox.askForNumericalInput("X Pos"));
    Tortoise.setY(MessageBox.askForNumericalInput("Y Pos"));
    moveMe();
  }
  public static void moveMe()
  {
    int penWidth = 5;
    float hue = 0;
    int angle = 15;
    int move = 1;
    while (true)
    {
      Tortoise.setPenWidth(penWidth);
      Tortoise.setPenColor(Color.getHSBColor(hue, 1, 1));
      Tortoise.move(move);
      Tortoise.turn(angle);
      //penWidth++;
      hue += .01;
      if (hue > 1)
      {
        hue = 0;
      }
      angle += 1;
      if (move > 100)
        move++;
    }
  }
}

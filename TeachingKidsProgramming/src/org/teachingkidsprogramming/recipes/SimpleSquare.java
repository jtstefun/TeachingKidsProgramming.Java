package org.teachingkidsprogramming.recipes;

import java.awt.Color;

import org.teachingextensions.logo.Tortoise;

public class SimpleSquare
{
  public static void main(String[] args) throws Exception
  {
    Tortoise.show();
    //  Make the tortoise move as fast as possible --#6
    Tortoise.setSpeed(10);
    moveMe();
  }
  public static void moveMe()
  {
    int penWidth = 5;
    float hue = 0;
    int angle = 15;
    while (true)
    {
      Tortoise.setPenWidth(penWidth);
      Tortoise.setPenColor(Color.getHSBColor(hue, 1, 1));
      Tortoise.move(10);
      Tortoise.turn(angle);
      //penWidth++;
      hue += .01;
      if (hue > 1)
      {
        hue = 0;
      }
      angle += 1;
    }
  }
}

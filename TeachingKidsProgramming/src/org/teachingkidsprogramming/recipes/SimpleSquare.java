package org.teachingkidsprogramming.recipes;

import java.awt.Color;

import org.teachingextensions.logo.Tortoise;

public class SimpleSquare
{
  public static void main(String[] args) throws Exception
  {
    Tortoise.show();
    //  Make the tortoise move as fast as possible --#6
    moveMe();
  }
  public static void moveMe()
  {
    for (int i = 0; i < 4; i++)
    {
      Tortoise.setPenColor(Color.BLUE);
      Tortoise.move(50);
      Tortoise.turn(90);
    }
    moveMe();
  }
}

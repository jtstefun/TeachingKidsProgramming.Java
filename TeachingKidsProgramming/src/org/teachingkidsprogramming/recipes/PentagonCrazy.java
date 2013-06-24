package org.teachingkidsprogramming.recipes;

import java.awt.Color;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class PentagonCrazy
{
  public static void main(String[] args)
  {
    Tortoise.setSpeed(10);
    //    createColorPalette (recipe below) --#8
    //    ------------- Recipe for createColorPalette --#8
    Color _color1 = Colors.Blues.SteelBlue;
    Color _color2 = Colors.Purples.DarkOrchid;
    Color _color3 = Colors.Blues.DarkSlateBlue;
    Color _color4 = Colors.Blues.Teal;
    Color _color5 = Colors.Purples.Indigo;
    ColorWheel.addColor(_color1);
    ColorWheel.addColor(_color2);
    ColorWheel.addColor(_color3);
    ColorWheel.addColor(_color4);
    ColorWheel.addColor(_color5);
    //    DrawPentagon (recipe below) --#10
    //    ------------- Recipe for drawPentagon --#10
    for (int i = 0; i < 200; i++)
    {
      int _penWidth = 1;
      _penWidth++;
      if (_penWidth > 4)
      {
        _penWidth = 1;
      }
      Tortoise.setPenColor(ColorWheel.getNextColor());
      Tortoise.setPenWidth(_penWidth);
      Tortoise.move(200);
      Tortoise.turn(360 / 5);
      Tortoise.turn((360 / 5) + 1);
    }
    //    Do the following 200 times --#2
    //        ------------- End of adjustPen recipe 
    //        Move the tortoise the length of a side --#4
    //        Turn the tortoise 1/5th of 360 degrees --#1
    //        Turn the tortoise 1 more degree --#5
    //    Repeat
    //    ------------- End of drawPentagon recipe
  }
}

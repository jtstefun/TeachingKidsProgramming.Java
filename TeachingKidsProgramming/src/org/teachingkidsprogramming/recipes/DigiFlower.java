package org.teachingkidsprogramming.recipes;

import java.awt.Color;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class DigiFlower
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.getBackgroundWindow().setColor(Colors.Grays.Silver);
    Tortoise.setPenWidth(3);
    Color _color1 = Colors.Reds.Red;
    Color _color2 = Colors.Oranges.DarkOrange;
    Color _color3 = Colors.Yellows.Gold;
    Color _color4 = Colors.Yellows.Yellow;
    ColorWheel.addColor(_color1);
    ColorWheel.addColor(_color2);
    ColorWheel.addColor(_color3);
    ColorWheel.addColor(_color4);
    ColorWheel.addColor(_color4);
    ColorWheel.addColor(_color3);
    ColorWheel.addColor(_color2);
    ColorWheel.addColor(_color1);
    for (int i = 0; i < 15; i++)
    {
      for (int j = 0; j < 8; j++)
      {
        Tortoise.setPenColor(ColorWheel.getNextColor());
        Tortoise.move(50);
        Tortoise.turn(360 / 8);
      }
      Tortoise.turn(360 / 15);
    }
    //      drawOctogon (recipe below) --#10
    //      Turn the tortoise 1/15th of 360 degrees to the right --#18
    //    Repeat
    //    ------------- Recipe for createColorPalette --#9
    //    Color 1 is red --#3
    //    Color 2 is dark orange --#11
    //    Color 3 is gold --#12
    //    Color 4 is yellow --#13
    //    Add color 1 to the color wheel --#3.1
    //    Add color 2 to the color wheel --#11.1
    //    Add color 3 to the color wheel --#12.1
    //    Add color 4 to the color wheel --#13.1
    //    Add color 4 to the color wheel --#14
    //    Add color 3 to the color wheel --#15
    //    Add color 2 to the color wheel --#16
    //    Add color 1 to the color wheel --#17
    //    ------------- Recipe for drawOctogon --#10
    //    Do the following 8 times --#6
    //      Change the color of the line the tortoise draws to the next color on the color wheel --#4
    //      Move the tortoise 50 pixels --#2
    //      Turn the tortoise 1/8th of 360 degrees to the right --#5
    //    Repeat  
  }
}

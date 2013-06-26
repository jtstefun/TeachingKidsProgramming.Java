package org.teachingkidsprogramming.recipes;

import org.teachingextensions.simpleparser.Parser;
import org.teachingextensions.utils.Viewer;
import org.teachingextensions.windows.MessageBox;

public class AdLibs
{
  public static void main(String[] args)
  {
    Words words = new Words();
    words.adverb = MessageBox.askForTextInput("Please enter an adverb ");
    //Ask the user to enter a verb ending in '-ed', save it as currentEdVerb --#4
    words.verb = "";
    forceEd(words);
    //Ask the user to enter a body part, save it as currentBodyPart --#6
    words.currentBodyPart = MessageBox.askForTextInput("Please state a boday part.");
    String story = Parser.parseRtfFile("view.rtf", words);
    //    MessageBox.showMessage(words.currentStory);
    Viewer.displayRtfFile(story);
    System.exit(0);
  }
  private static void forceEd(Words words)
  {
    while (words.verb.equals(""))
    {
      String verb = MessageBox.askForTextInput("Please enter a verb ending in \"ed\"");
      if (verb.endsWith("ed"))
      {
        words.verb = verb;
      }
    }
  }
}
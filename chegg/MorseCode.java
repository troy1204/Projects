import java.util.Scanner;
import java.util.*;
import java.io.*;
public class MorseCode {
public static void main (String [] args)
{
  int choice = 1;
  System.out.println ("Type 1 or 2 to select your conversion options");
  System.out.println ("(1) Translate a English sentence into morse code");
  System.out.println ("(2) Translate a morse code into an English sentence");
   
  try{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    choice =  Integer.parseInt(br.readLine()); //Read input choice
  }
  catch(IOException ioe) {
    System.out.println("Bad input");
  }

  if (choice==1)
  {
      Scanner englishtomorse = new Scanner(System.in);
      System.out.println ("Please your English sentence.");
      String english = englishtomorse.nextLine();
      System.out.println (englishtoMorse(english));
  }
  else
  {
      System.out.println ("Please enter your morse code.");
      String morse = "";
      try{
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        morse = br2.readLine();
      }
      catch(IOException ioe) {
        System.out.println("Bad input");
      }
      System.out.println (morsetoEnglish(morse));
  }
}

public static String englishtoMorse(String english)
{
String alphabet = "ABC DEFGHIJKLMNOPQRSTUVWXYZ";
String code[] = {".-", "-...", "-.-.", "|", "-..",".","..-.","--.", "....",
   "..", ".---", "-.-", ".-..", "--","-.", "---", ".--.", "--.-", ".-.",
   "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
english = english.toUpperCase();
for(int xyz = 0; xyz < english.length(); ++xyz)
{
   char letter = english.charAt(xyz);
   if (letter == ' ')
   {
    System.out.print (" | ");
    continue;
   }
      for(int variable = 0; variable < alphabet.length(); ++variable)
      {
          if(alphabet.charAt(variable) == letter)
          {
           System.out.print(code[variable] + " ");
           break;
          }
      }
     }
     return " ";
}



  public static String morsetoEnglish(String morse)
  {
    Hashtable<String, String> mapping = new Hashtable<String, String>();
    mapping.put(".-", "A");
    mapping.put("-...", "B");
    mapping.put("-.-.", "C");
    mapping.put("|", " ");
    mapping.put("-..", "D");
    mapping.put(".", "E");
    mapping.put("..-.", "F");
    mapping.put("--.", "G");
    mapping.put("....", "H");
    mapping.put("..", "I");
    mapping.put(".---", "J");
    mapping.put("-.-", "K");
    mapping.put(".-..", "L");
    mapping.put("--", "M");
    mapping.put("-.", "N");
    mapping.put("---", "O");
    mapping.put(".--.", "P");
    mapping.put("--.-", "Q");
    mapping.put(".-.", "R");
    mapping.put("...", "S");
    mapping.put("-", "T");
    mapping.put("..-", "U");
    mapping.put("...-", "V");
    mapping.put(".--", "W");
    mapping.put("-..-", "X");
    mapping.put("-.--", "Y");
    mapping.put("--..", "X");

    String marr[] = morse.split(" ");
    for(int i = 0; i<marr.length; i++){
      if(mapping.containsKey(marr[i])){
        System.out.printf("%s",mapping.get(marr[i]));
      }
    }
    return "";
  }
}
import java.io.*;
public class SocSecProcessor
{
  static String n = "";
  static String s = "";
  static String c = "";
  boolean result;
  
  public static void main (String args[])
  {
    InputStreamReader is = new InputStreamReader(System.in);
    BufferedReader buf = new BufferedReader(is);
    try
    {
      while(true){
        System.out.println("Enter name or press E to exit : ");
        n = buf.readLine();
        if(n.equals("E") || n.equals("e"))
          System.exit(0);
        System.out.println("Enter social security number or press E to exit : ");
        s = buf.readLine();
        if(n.equals("E") || n.equals("e"))
          System.exit(0);
        System.out.println("Entered name is : " + n);
        System.out.println("Entered social security number is : " + s);
        try
        {
          isValid(s);   // this method throws SocSecException
        }
        catch (SocSecException se)   // but it is caught here
        {
          System.out.println("Spell exception was: " + se.mistake);
        }  
      }
    }
    catch (IOException e)
    {
      System.out.println("Exception while reading input");
    }
  } // end main
  
  private static boolean isValid(String ssn) throws SocSecException
  {
    if(ssn.length() == 11 ){
      if(ssn.charAt(3) == '-' && ssn.charAt(6) == '-'){
        for(int k=0; k<ssn.length(); k++){
          if(k!=3 && k!=6 && Character.isDigit(ssn.charAt(0))){
            System.out.println("Valid Social Security Number was Entered!");
            return true;
          }
          else{
            throw new SocSecException("Format is incorrect. Social Security Number can only contain digits between 0-9");
          }
        }
      }
      else{
        throw new SocSecException("Format is incorrect. Social Security Number format is xxx-xx-xxxx");
      }
    }
    else{
      throw new SocSecException("Not enough digits entered for valid social security number");
    }
    return false;
   }
} 
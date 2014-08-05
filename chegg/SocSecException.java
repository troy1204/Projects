// Custom exception class that descends from Java's Exception class.
class SocSecException extends Exception
{
  String mistake;
  
  public SocSecException(String err)
  {
    super(err);     // call super class constructor
    mistake = err;  // save message
  }
}
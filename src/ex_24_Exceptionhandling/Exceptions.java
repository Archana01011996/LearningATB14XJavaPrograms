package ex_24_Exceptionhandling;

public class Exceptions {
    public static void main(String[] args) {
try {
    String ip = args[0]; //just run program without entering data we get ArrayIndexOutOfBoundsException
    int a = Integer.parseInt(ip);  //if we give input as string we get NumberFormatException
    int b = 100 / a;           //if we put 0 as input we get Arithmetic Exception
    System.out.println(b);
}
catch(Exception e)
{
    System.out.println(e.getMessage());
}
  try {
      String s = null;
      s.trim(); //gives NullpointerException
  }
  catch(NullPointerException e)
  {
      System.out.println("Not valid");

  }
    }
}

package ex_24_Exceptionhandling;

public class Multiplecatchblocks {
    public static void main(String[] args) {

        System.out.println("Program is started");
        String s=null;
        try {
            System.out.println(s.length());
        }
        catch(ArithmeticException e)
        {
            System.out.println("Handled exception");
            System.out.println(e.getMessage());
        }
        catch(NullPointerException e)
        {
            System.out.println("Handled exception");
            System.out.println(e.getMessage());
        }
        catch(NumberFormatException e)
        {
            System.out.println("Handled exception");
            System.out.println(e.getMessage());
        }
        //if we dont know which exception we can use this because Exceotion is parent of all kinds of exceptions
        catch(Exception e) {
            System.out.println("Handled exception");
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("This is finally block and exeucted evert time");
        }


        System.out.println("Program finished");
    }
}

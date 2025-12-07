package ex_24_Exceptionhandling;

public class Finally_not_executed {
    public static void main(String[] args) {
        try {
            int a = 10 / 10;
            System.out.println("try block executed");
            System.exit(0);
        } catch (Exception e) {
            System.out.println("catching exception");
        }
        finally{
            System.out.println("I will be executed");
        }
    }
}

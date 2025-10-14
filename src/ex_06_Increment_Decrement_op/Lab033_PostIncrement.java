package ex_06_Increment_Decrement_op;

public class Lab033_PostIncrement {
    public static void main(String [] args)
    {
        int a=10;
        int b= a++;   //first a is assigned (10 is assigned to b) then its incremented
        System.out.println(a); //11
        System.out.println(b); // 10

    }
}

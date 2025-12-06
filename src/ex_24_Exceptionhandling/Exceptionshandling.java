package ex_24_Exceptionhandling;

import java.util.Scanner;

public class Exceptionshandling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Arithmetic exception
        System.out.println("Enter number");
        int num=sc.nextInt();
        //1 try block can have multiple catch block
        try {
            System.out.println(100/num);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Invalid data");
        }
        System.out.println("Program is completed");
        System.out.println("Program is exited");



    }
}

package ex_24_Exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        System.out.println("Program started");
        System.out.println("Program is in progress");

       FileInputStream file=new FileInputStream("c:\\TEXT.txt");  //FileNOTfOUNDeXCEPTION

        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println("Program completed");

        Thread.sleep(5000);  //using throws
        System.out.println("Program exited");


    }
}

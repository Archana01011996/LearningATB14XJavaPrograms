package ex_24_Exceptionhandling;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exceptionsdemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Arithmetic exception
        System.out.println("Enter number");
        int num=sc.nextInt();
        System.out.println(100/num);  //arithmetic exception
        System.out.println("Program is completed");
        System.out.println("Program is exited");

        //ArrayIndexOutOfBoundsException
        int a[]=new int[5];
        System.out.println("Enter the position 0-4 ");
        int pos=sc.nextInt();
        System.out.println("Enter the value");
        int value=sc.nextInt();
        a[pos]=value;           //ArrayIndexOutOfBoundsException
        System.out.println(a[pos]);

        //Number format exception
        String s1="welcome";
        int n=Integer.parseInt(s1);  //NumberFormatException
        System.out.println(n);

        //Null pointer exception
        String s=null;
        System.out.println(s.length());  //NllPointerException
    }
}

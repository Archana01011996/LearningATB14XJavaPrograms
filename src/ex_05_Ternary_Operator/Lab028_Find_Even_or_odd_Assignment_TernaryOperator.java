package ex_05_Ternary_Operator;

import java.util.Scanner;

public class Lab028_Find_Even_or_odd_Assignment_TernaryOperator {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        float number=sc.nextInt();
        String result =(number%2==0)?"Even Number" :"Odd Number";
        System.out.println(result);






    }
}

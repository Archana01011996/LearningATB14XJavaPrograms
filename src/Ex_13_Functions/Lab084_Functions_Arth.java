package Ex_13_Functions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab084_Functions_Arth {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
         int a=readInt(sc,"Enter int num1");
         int b=readInt(sc,"Enter int num2");

        int sum_res= sum(a,b);
       int sub_res=sub(a,b);
       int div_res=div(a,b);
       int mul_res=mul(a,b);
       int mod_res=mod(a,b);

        System.out.println(sum_res);
        System.out.println(sub_res);
        System.out.println(div_res);
        System.out.println(mul_res);
        System.out.println(mod_res);


    }

    static int readInt(Scanner sc ,String prompt) {
        System.out.println(prompt);
        {
            if (sc.hasNextInt()) {
                return sc.nextInt();
            } else {
                System.out.println("Enter int num only");
                System.exit(0);
                return 0;

            }
        }
    }
    static int sum(int a ,int b)
        {
        return a+b;
        }
        static int sub(int a,int b)
        {
            return a-b;
        }
        static int div(int a ,int b)
        {
            if(b==0)
            {
            throw new ArithmeticException("Division by zero is not allowed");
            }
            return a/b;

        }
        static int mul(int a,int b)
        {
            return a*b;
        }
        static int mod(int a ,int b) {

        return a % b;
        }
}

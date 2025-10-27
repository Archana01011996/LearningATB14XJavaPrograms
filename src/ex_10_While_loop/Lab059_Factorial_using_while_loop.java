package ex_10_While_loop;

import java.util.Scanner;

public class Lab059_Factorial_using_while_loop {
    public static void main(String[] args) {
        int fact=1;
        int n=5;

        int i=1;
        while(n>=i)
        {
            fact=fact*i;
            i++;
        }
        System.out.println(fact);

        //or
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for factorial");

        if(!sc.hasNextInt())
        {
            System.out.println("Entered number is not  integer number ");
        }
        else {
            int num = sc.nextInt();
            int fact1 = 1;
            if (num == 0) {
                fact1 = 1;
                System.out.println("fact=1");
            }
            if (num < 0 || num > Integer.MAX_VALUE) {
                System.out.println("Can't get the factorial as out of bpund exception(int)");
            }


            int i1 = 1;
            while (num >= i1) {
                fact1=fact1*i1;
                i1++;

            }
            System.out.println(fact1);



        }
    }
}

package ex_09_For_loop;

import java.util.Scanner;

public class Factorial_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int fact=1;

        if(n==0) {
            fact = 1;
        }

                     for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }

      /*  for(int i=n;i>=1;i--)
        {
            fact=fact*i;
        }
        */
        System.out.println(fact);



    }
}

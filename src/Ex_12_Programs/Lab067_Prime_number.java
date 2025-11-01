package Ex_12_Programs;

import java.util.Scanner;

public class Lab067_Prime_number {
    public static void main(String[] args) {
        //natural number>1
        //primenumber -a number which has 2 factor 1 and itself
        //19=prime number
        //4-factors are 1,2,4 -not a prime number

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int count=0;

        if(num>1)
        {
            for(int i=1;i<=num;i++) {
                if (num % i == 0) {
                    count++;
                }
            }
                if(count==2)
                {
                    System.out.println("Its a prime number");
                }
                else
                {
                    System.out.println("not a prime number");
                }

            }

        else {
            System.out.println("Enter number > 1");
        }




    }
}

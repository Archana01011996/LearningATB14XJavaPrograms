package ex_10_While_loop;

import java.util.Random;
import java.util.Scanner;

public class Lab060_While_guessing_game {
    public static void main(String[] args) {

        Random random=new Random();
        int guess_number=random.nextInt(101);  //between 1-100  (101 is not included)
        System.out.println(guess_number);

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the guessing number between 1-100");
        int guess;
        int attempts=0;

        while(true)
        {
            if(! sc.hasNextInt())
            {
                System.out.println("Invalid input! please enter a number");
                sc.next();
                continue;
            }
            guess=sc.nextInt();
            attempts++;

           if(guess<0 || guess>100)
            {
                System.out.println("Enter number between 1-100");
            }
           else if (guess<guess_number)
           {
               System.out.println("Too low try again");
           }
           else if(guess>guess_number)
           {
               System.out.println("Too high ,try again");
           }
           else {
                System.out.println("correct match " +"and number is" + guess  +  "and attempts takem to guess is "+  attempts);
                break;
            }

        }



    }
}

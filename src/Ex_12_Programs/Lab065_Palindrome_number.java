package Ex_12_Programs;

import java.util.Scanner;

public class Lab065_Palindrome_number {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
       int number=sc.nextInt();
       int palindrome_number=number;
       int rev=0;


       while(number!=0)
       {
           rev=rev*10+number%10;

           number=number/10;

       }
if(palindrome_number==rev)
{
    System.out.println("Its palindrome number");
}
else {
    System.out.println("Not a palindrome number");
}
    }
}

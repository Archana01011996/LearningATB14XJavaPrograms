package ex_24_Exceptionhandling;

import java.util.Scanner;

public class ThrowExample {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter user age");
        int user_age=sc.nextInt();
        validate_age_for_club(user_age);
    }
    static void validate_age_for_club(int age){
        if(age<25)
        {
            try {
                throw new Exception("Age can't be less than 25");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        else {
            System.out.println("Emjoy clubbing");
        }

    }

}

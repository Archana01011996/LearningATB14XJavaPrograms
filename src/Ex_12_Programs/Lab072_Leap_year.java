package Ex_12_Programs;

import java.util.Scanner;

public class Lab072_Leap_year {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int Year = sc.nextInt();
        boolean isLeapyear = false;

        if (Year <=0)
        {
            System.out.println("Enter a valid year date");
        }

        if ((Year %4==0 &&  Year % 100!=0) || (Year %400==0))
            {
                isLeapyear=true;
            }
            if(isLeapyear)
            {
                System.out.println(Year + "  is leap year");
            }
            else
            {
                System.out.println(Year + "  mis not leap year");
            }



    }
}

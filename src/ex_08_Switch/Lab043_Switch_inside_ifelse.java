package ex_08_Switch;

import java.util.Scanner;

public class Lab043_Switch_inside_ifelse {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number from 1 to 7");


        if(sc.hasNextInt())
        {
            int day =sc.nextInt();
            switch (day)

            {
                case 1:
                    System.out.println("mon");

                case 2:
                    System.out.println("tue");
                    break;
                case 3:
                    System.out.println("wed");
                    break;
                case 4:
                    System.out.println("thurs");
                    break;
                case 5:
                    System.out.println("fri");
                    break;
                case 6:
                    System.out.println("sat");
                    break;
                case 7:
                    System.out.println("sat");
                    break;

                default:
                    System.out.println("Enter valid day number");

            }

        }
        else {
            System.out.println("Entered number is not integer");
        }




    }
}

package Ex_12_Programs;

import java.util.Scanner;

public class Loaneligible {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age");
        int age=sc.nextInt();
        System.out.println("Enter salary");
        float sal=sc.nextFloat();
        System.out.println("Enter credit score");
        int cs=sc.nextInt();

        if(age<=0 || age>Integer.MAX_VALUE )
        {
            System.out.println("Enter positive number for age");
        }
        if(sal<=0.0)
        {
            System.out.println("Enter salary in positive number");
        }
        if(cs<=0)
        {
            System.out.println("Enter credit score as positive number");
        }

        if((age>=18 && age<=80) && (sal>=30000.00) && (cs>=165 && cs<=850))
        {
            System.out.println("Eligible for loan");
        }
        else
        {
            System.out.println("Not eligible for loan");
        }

    }
}

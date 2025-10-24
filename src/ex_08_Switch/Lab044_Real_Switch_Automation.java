package ex_08_Switch;

import java.util.Scanner;

public class Lab044_Real_Switch_Automation {
    public static void main(String[] args) {
        //Web automation
        //when user wants input from different browser
        //i will start automation in that browser

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser=sc.next();

        switch(browser)
        {
            case "chrome":
                System.out.println("Invoke chrome browser");
                break;
            case "firefox":
                System.out.println("Invoke the firefox browser");
                break;
            case "edge":
                System.out.println("Invoke the edge browser");
                break;
            default:
                System.out.println("Enter correct browser");
                break;


        }
    }
}

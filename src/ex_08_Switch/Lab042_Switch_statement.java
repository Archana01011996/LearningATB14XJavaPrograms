package ex_08_Switch;

import java.util.Scanner;

public class Lab042_Switch_statement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
              int day=sc.nextInt();
              switch (day)
              {
                  case 1:
                      System.out.println("Mon");
                      break;
                  case 2:
                      System.out.println("tues");
                      break;
                  case 3:
                      System.out.println("wed");
                      break;
                  case 4:
                      System.out.println("thursday");
                      break;
                  case 5:
                      System.out.println("fri");
                      break;
                  case 6:
                      System.out.println("sat");
                      break;
                  case 7:
                      System.out.println("sun");
                  default:
                      System.out.println("Invalid day number");
              }
    }
}

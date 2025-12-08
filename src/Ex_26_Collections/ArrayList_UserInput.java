package Ex_26_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList_UserInput {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String continueinput="Y";
        List<String> names=new ArrayList<>();

        while(continueinput.equalsIgnoreCase("Y"))
        {
            System.out.println("Enter the name");
           String name= sc.next();
           names.add(name);
           sc.nextLine();

            System.out.println("Do you want to enter another name?");
            continueinput=sc.nextLine();
        }

        for(String name:names)
        {
            System.out.println(name);
        }
        sc.close();
    }
}


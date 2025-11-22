package Ex_16_Arrays;

import java.util.Scanner;

public class Lab096_Arrays_User_input {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of an array");
                int  size=sc.nextInt();
              int[] number_marks=new int[size];

                for(int i=0;i< number_marks.length;i++)
                {
                    System.out.println("Enter the elements at "+  i +  "index");
                    number_marks[i]=sc.nextInt();
                }
                //for printing numbers
            for(int marks:number_marks)
            {
                System.out.println(marks);
            }
    }
}

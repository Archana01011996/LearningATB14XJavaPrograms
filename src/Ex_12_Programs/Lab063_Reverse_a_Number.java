package Ex_12_Programs;

import java.util.Scanner;

public class Lab063_Reverse_a_Number {
    public static void main(String[] args) {
     //   int num=12345;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num");
        int num=sc.nextInt();
        int rev=0;
        while(num!=0)
        {
            rev=(rev*10)+num%10;
            num=num/10;
        }
        System.out.println(rev);

        //using String buffer class-2 nd logic
      //  StringBuffer sb=new StringBuffer(String.valueOf(num));
        StringBuffer sb=new StringBuffer(String.valueOf(rev));
        //here i will replace num with reverse num as num is already 0 in above so rev will give a proper number
        StringBuffer rev1=sb.reverse();
        System.out.println(rev1);

        //Uisng String builder class
        StringBuilder sb1=new StringBuilder();
               // sb1.append(num);
        sb1.append(rev);
        //here i will replace num with reverse num as num is already 0 in above so rev will give a proper number
        StringBuilder rev2=sb1.reverse();
        System.out.println(rev2);

    }
}

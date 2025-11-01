package Ex_12_Programs;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab071_Reverse_string_using_char_array {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        System.out.println(str);
        String rev="";
       int len= str.length();
        char a[]=str.toCharArray();
        for (int i = len-1; i >=0 ; i--) {
            rev=rev+a[i];
        }
        System.out.println(rev);



    }
}

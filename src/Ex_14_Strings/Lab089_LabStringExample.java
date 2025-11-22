package Ex_14_Strings;

import java.util.Arrays;

public class Lab089_LabStringExample {
    public static void main(String[] args) {
        CharSequence s="Archana".subSequence(1,4);
        System.out.println(s);

        String s1="RenukaPrasad".substring(0,6);  //6 means till 5 th index it will count
        System.out.println(s1);

       char a[]= "Java".toCharArray();
        System.out.println(Arrays.toString(a));  //[J, a, v, a]
        System.out.println(a);   //java

        boolean b= " " .isBlank();
        System.out.println(b);   //true

        String s3="ab".repeat(3);
        System.out.println(s3);   //ababab


    }
}

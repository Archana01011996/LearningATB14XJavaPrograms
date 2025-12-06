package ex_23_Wrapper;

import java.sql.SQLOutput;

public class Boxing_unboxing {
    public static void main(String[] args) {
        //autoboxing-jvm does it
        int a=10;
        Integer b=a;

        //unboxing
        Integer c=10;
        int d=c;

        //String to intger
        String s1="10";
        String s2="20";
        System.out.println(s1+s2);   //1020
        System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2));  //30
        //Double.parseDouble(String value)
        //Float.parseFloat(String value)
        //Boolean.parseBoolean(Stringvalue)

        //int,double,char,boolean -->String
        int  a1=10;
        double d1=10.5;
        char c1='A';
        boolean b1=false;
        String s3=String.valueOf(a1);
        System.out.println(s3);
        System.out.println(String.valueOf(d1));
        System.out.println(String.valueOf(c1));
        System.out.println(String.valueOf(b1));



    }
}

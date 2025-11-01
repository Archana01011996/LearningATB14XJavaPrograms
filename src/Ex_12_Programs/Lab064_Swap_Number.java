package Ex_12_Programs;

import java.sql.SQLOutput;

public class Lab064_Swap_Number {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("Numbers before swap " +  " "  +b);
        int t=a;
         a=b;
         b=t;
        System.out.println("Numbers after swap  " + a + " "   +b );

        // 2nd logic
       a=a+b;  //a=30
       b=a-b;   //b=10
       a=a-b;   //a=20

        //3 rd logic
        a=a+b;
        b=a/b;
        a=a/b;

        //4 th logic
        a=a^b;
        b=a^b;
        a=a^b;

        //4 th logic
        b=a-b-(a=b);
        //b=10-20-(20)
        //b=10-20
        //b=10

    }
}

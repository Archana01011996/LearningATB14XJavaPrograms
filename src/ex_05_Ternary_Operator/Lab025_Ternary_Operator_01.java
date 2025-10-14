package ex_05_Ternary_Operator;

import java.sql.SQLOutput;

public class Lab025_Ternary_Operator_01 {
    public static void main(String[] args) {
        int age=18;
        String canMeetijagotoGOA= age>18?"Yes":"No";
        System.out.println(canMeetijagotoGOA);

        int number=5;
        String result=number>0?"+Ve num":"-Ve num";
        System.out.println(result);
//ex for arithmetic expression
    /*    int a = 2 - -7;
        System.out.println(a);
        boolean b=(5 / 0 == 0);
        System.out.println(true &&b);  */

       // int a = b = c = 999; //throws compile time error
      //  boolean valid = TRUE;  //throws compile time error as TRUE is in caps

        int _123 = 99;
        System.out.println(_123);

        char CHAR = 'A';
        System.out.println(CHAR);  //A
        char ch='A';
        System.out.println(ch);  //A
        char a ='A';
        System.out.println(a);  //A
        System.out.println(a+ch);  //130
        int c = c = c = 10;
        System.out.println(c);
        int x = 5;
        System.out.println(x++ + ++x);
        /* Step 1: Understand the operators

 x++ → post-increment: returns the current value, then increments x.

++x → pre-increment: increments x first, then returns the new value.

Step 2: Evaluate the expression x++ + ++x

Initial x = 5

x++ → returns 5 (then x becomes 6)

++x → increments x from 6 → 7, returns 7

So expression: x++ + ++x = 5 + 7 = 12 ✅*/

        System.out.println(10 + 20 + "Java" + 10 + 20);
        String name="dino";
        if(name == "dino")
            System.out.print("DINO");
        System.out.println("GOOD");
        int x1 = 5;
        if(x1 > 3)
            if(x1 < 10)
            System.out.print("A");
        else
            System.out.print("B");
    }
}

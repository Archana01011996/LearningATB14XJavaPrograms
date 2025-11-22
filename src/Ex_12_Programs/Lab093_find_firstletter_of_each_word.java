package Ex_12_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class Lab093_find_firstletter_of_each_word {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
       String str= sc.nextLine();
             String st=" " + str.toUpperCase();
             int ind=st.lastIndexOf(' ');
             int len=st.length();

        for (int i = 0; i <len ; i++) {
            char ch=st.charAt(i);

            if(ch==' ')
            {
                if(ind==i)
                {
                    System.out.print(st.charAt(i+1));
                }
                else
                {
                    System.out.print(st.charAt(i+1) + " ." );
                }
            }

        }






        }
}

package Ex_12_Programs;
import java.util.Scanner;

public class Lab070_Reverse_string_using_stringbuilder_stringbuffer_class {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();


        StringBuffer sb=new StringBuffer(str);
        StringBuffer rev=sb.reverse();
        System.out.println(rev);

        //or using string builder
        StringBuilder sb1=new StringBuilder(rev);
       StringBuilder rev1= sb1.reverse();
        System.out.println(rev1);

    }
}

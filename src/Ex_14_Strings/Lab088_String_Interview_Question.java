package Ex_14_Strings;

public class Lab088_String_Interview_Question {
    public static void main(String[] args) {
        String s1="hello";
        String s2="hello";

        String s3=new String("Hello");
        String s4=new String("Hello");
        String s5=new String("hello");

        //== -->comparison--String==>This check the reference location

        System.out.println(s1==s2);  //true
        System.out.println(s1==s3);  //false
        System.out.println(s3==s4);  //false
        System.out.println(s2==s5);   //false

        //equals ==>checks content -->value
        System.out.println(s2.equals(s5));      //true
        System.out.println(s3.equals(s4));     //true
        System.out.println(s1.equalsIgnoreCase(s3));  //true

    }
}

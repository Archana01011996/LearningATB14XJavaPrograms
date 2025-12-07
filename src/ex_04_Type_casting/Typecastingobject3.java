package ex_04_Type_casting;

public class Typecastingobject3 {
    public static void main(String[] args) {

        Object o=new String("welcome");
        StringBuffer sb=(StringBuffer) o;   //Rule 1=yes ,Rule 2=yes ,Rule 3=Failed

//        //Ex 2
//        String s=new String("welcome");
//        StringBuffer sb1=(StringBuffer) s;  //rule 1 failed ..string buffer and string are not related

//        //ex 3
//        Object o1=new String("Welcome");
//        StringBuffer sb2=(String) o1; //rule 1=yes ,rule 2=failed
//
//        //ex  4
//        String s=new String("Welcome");
//        StringBuffer sb3=(String) s;  //rule 1=yes ,rule 2-failed

        //ex 5
        Object o3=new String("welcome");
        String s4=(String) o3; //rule 1=yes ,rule 2=yes rule 3=yes
        System.out.println(s4);

    }
}

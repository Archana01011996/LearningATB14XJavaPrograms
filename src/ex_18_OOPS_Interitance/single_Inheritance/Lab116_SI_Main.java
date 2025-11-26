package ex_18_OOPS_Interitance.single_Inheritance;

public class Lab116_SI_Main {
    public static void main(String[] args) {


    Lab115_SI_Son s =new Lab115_SI_Son();
        s.bhk3();
        s.bhk2();
        System.out.println(s.gold_f);

        Lab114_SI_Father f1=new Lab114_SI_Father();
        s.bhk2();
        System.out.println(s.gold_f);
      //  f1.bhk3();  --not possible as father has not inherited sons

}}


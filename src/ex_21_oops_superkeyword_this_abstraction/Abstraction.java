package ex_21_oops_superkeyword_this_abstraction;

public class Abstraction {
    public static void main(String[] args) {
        son s1=new son();
        s1.loan50k();
        s1.loan10k();
    }
}
abstract class AmitFather{
    abstract void loan50k();
    void loan10k()
    {
        System.out.println("Given");
    }
}
 class son extends AmitFather{
     @Override
     void loan50k() {
         System.out.println("Completed");

     }
 }
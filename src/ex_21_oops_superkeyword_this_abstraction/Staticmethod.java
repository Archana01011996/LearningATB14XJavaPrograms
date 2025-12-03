package ex_21_oops_superkeyword_this_abstraction;

public class Staticmethod {

    static int a=10;
    int b=20;

    static void m1()
    {
        System.out.println("this is static method");

    }
    void m2()
    {
        System.out.println("This is non static method");
    }
    void m() {
        System.out.println("I am non static method ,I can access all static and non static variable and methods");
        System.out.println(a);
        System.out.println(b);
        m1();
        m2();
    }

    public static void main(String[] args) {
        //static methods can be access directly
        System.out.println(a);
        m1();
        //non static needs object creation
        Staticmethod sm=new Staticmethod();
        System.out.println( sm.b);
        sm.m2();
        sm.m();
    }
}

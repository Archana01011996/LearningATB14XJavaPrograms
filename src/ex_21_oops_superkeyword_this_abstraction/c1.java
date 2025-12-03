package ex_21_oops_superkeyword_this_abstraction;

public class c1 extends c2 implements I1,I2{
    public void m1()
    {
        System.out.println(x);
    }
    public void m2()
    {
        System.out.println(y);
    }

    public static void main(String[] args) {
        c1 c=new c1();
        c.m1();
        c.m2();
        c.m3();
    }
}

package ex_21_oops_superkeyword_this_abstraction;

public class Multiple_Inheritance {
    public static void main(String[] args) {


    child c=new child();
    c.money();
}}

interface Father1{
    void money();
}
interface Father2{
    void money();
}
class child implements Father1,Father2{

    @Override
    public void money() {
        System.out.println("child Money");
    }
}
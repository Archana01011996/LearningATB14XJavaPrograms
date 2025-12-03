package ex_21_oops_superkeyword_this_abstraction;


import org.w3c.dom.ls.LSOutput;

interface shape{
    int length=10;  //static and final
int width=10;  //static and final

    void circle(); //abstract method

    default void square() {
        System.out.println("this is default method");
    }
    static void rectangle()
    {
        System.out.println("this is static method");
    }
}
public class Interfacedemo implements shape {
   public  void circle()
    {
        System.out.println("This is circle -implemted method");
        System.out.println(shape.length);
        System.out.println(shape.width);
    }

    void triangle()
    {
        System.out.println("this is class method triangle");
    }
    public static void main(String[] args) {

       //scenario 1 creating object for claass
        Interfacedemo id=new Interfacedemo();
        id.circle();
        id.square();
        id.triangle();
        shape.rectangle();//static method can access directly without object and with interface name.method/variable name
        System.out.println(shape.length);  //static variable can access directly with interface name

        //scenario2 -creating am object with class and interface to hold reference object

        shape sh=new Interfacedemo();
        sh.circle();
        sh.square();
        shape.rectangle();
        //sh.triaangle()  //not possible as interface only holds value
    }
}

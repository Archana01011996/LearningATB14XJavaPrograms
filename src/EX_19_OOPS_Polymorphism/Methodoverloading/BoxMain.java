package EX_19_OOPS_Polymorphism.Methodoverloading;

public class BoxMain {
    public static void main(String[] args) {
        Box b=new Box();
      //  Box b1=new Box(10.5,11.5,12.5);
       double d= b.volume();
        System.out.println(d);
        Box b2=new Box(20.5);

    }
}

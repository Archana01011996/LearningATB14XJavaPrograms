package EX_19_OOPS_Polymorphism.Methodoverriding;

public class Methodoverriding {
    public static void main(String[] args) {
        Son s= new Son();
        s.home();      //3 bhk
        Father f=new Father();
                f.home();  //2 bhk

        Father f1=new Son();
        f1.home();    //3 bhk   (whoseever object is)
    }
}

class Father{
    void home()
    {
        System.out.println("2 bhk");
    }

}
class Son extends Father{
    void home()
    {
        System.out.println("3bhk");
    }
}
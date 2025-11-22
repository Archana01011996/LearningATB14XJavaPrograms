package ex_17_Oops;

public class Lab109_cats_oops {
    public static void main(String[] args) {
        cat c1=new cat();
        System.out.println(c1.name);  //kitty
        cat c2=new cat("Lucy");
        System.out.println(c2.name);   //lucy
        cat c3=new cat("Spicy");
        c3.running();
    }
}

class cat{
    String name;     //instance variable
    cat()
    {
      name="kitty";
        System.out.println("Hi I am  default constructor");

    }
    cat(String nameparam)
    {
          this.name=nameparam;
    }

    void running(){
            int local_variable=10;
        System.out.println("who is running " + this.name);


    }

}

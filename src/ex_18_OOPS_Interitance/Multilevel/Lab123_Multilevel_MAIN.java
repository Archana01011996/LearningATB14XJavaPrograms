package ex_18_OOPS_Interitance.Multilevel;

public class Lab123_Multilevel_MAIN {
    public static void main(String[] args) {
        Lab122_Son s=new Lab122_Son();
        s.home();
        s.gf();
        s.extra();
        s.bhk3();

        Lab121_Father f=new Lab121_Father();
        f.extra();
        f.home();
        f.gf();

        Lab120_Grandfather gf=new Lab120_Grandfather();
        gf.gf();
        gf.home();

       // Dynamic Dispatch

        Lab120_Grandfather g1=new Lab122_Son();
        //Can only access Grandfather properties
                 g1.home();
                 g1.gf();

                 Lab121_Father f1=new Lab122_Son();
                 // can access father and grandfather as it is extended
                 f1.gf();
                 f1.home();
                 f1.extra();

                 //Lab122_Son s1=new Lab120_Grandfather(); //not possible cannot fit large in small ,/object is not created when grandfather class is created
        //Lab122_Son s1=new Lab121_father(); //not possiblea                        a

    }
}

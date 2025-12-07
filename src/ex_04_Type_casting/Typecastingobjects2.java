package ex_04_Type_casting;

class Animal{}
class  Cat extends Animal{}
class  Dog extends Animal{}

public class Typecastingobjects2 {
    public static void main(String[] args) {

        //Rule 1: Conversion is valid or not  =if failed we get compile time error
        //The type of 'c' and 'd' must have some relationship(either parent to child or child to parent)

        Animal an=new Dog();
        Cat ct=(Cat)an; //valid as per rule no 1

//        Dog dg=new Dog();
//        Cat ct=(Cat)dg;  //Invalid as per rule 2

        //Rule 2:Assignment is valid or not   =if failed we get compile time error
        // 'C' must be either same or child of 'A'

        Animal an1=new Dog();
        Cat ct1=(Cat)an;    //Valid as per rule 2

//        Animal an2=new Dog();
//        Cat ct2=(Dog)an;   //invalid as per rule 2

        //Rule 3 =if failed then we get run time exception)class cast exception
       // The underlying object of 'd' must be either same or child of 'c'

//        Animal an2=new Dog();
//        Cat ct2=(Cat)an;        //this gives compile time error as underlying object of an is Dog but we have cat in c positionm and they dont have any relationship

        Animal an3=new Dog();
        Dog dg=(Dog) an3;  //rule1=yes, rule 2=yes ,rule 3=yes
    }
}

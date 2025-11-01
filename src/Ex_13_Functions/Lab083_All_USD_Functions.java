package Ex_13_Functions;

public class Lab083_All_USD_Functions {
    public static void main(String[] args) {
      //1
        wop_wor();
      //2
         String msg= wop_wrt();
        System.out.println(msg);
        //3
        greet_with_details("Archana" ,30 ,150000);

        //4
        int result=Sum_of_two_number(3, 5);
        System.out.println(result);
    }

    //Without paramater without return type
    static void wop_wor()
    {
        System.out.println("Hi ,I am not returning anything");
    }

    //without pramater,with return type

    static String wop_wrt()
    {
        return " message";
    }

    //With paramter and without return type

    static void greet_with_details(String name ,int age,double salary)
    {

        System.out.println("Your name is " + name + "\n Your age is " + age + "\n Your salary is " + salary);
    }

    //With paramater and with return typr

    static int Sum_of_two_number(int a,int b)
    {
        return a+b;
    }
}

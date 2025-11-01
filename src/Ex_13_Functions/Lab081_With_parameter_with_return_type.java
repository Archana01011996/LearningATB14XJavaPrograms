package Ex_13_Functions;

public class Lab081_With_parameter_with_return_type {
    public static void main(String[] args) {
       int result= Sum_of_two_number(3,5);
       int result1=Sum_of_two_number(45,65);
        System.out.println(result);
        System.out.println(result1);
    }

    static int Sum_of_two_number(int a,int b)
    {
   return a+b;
    }
}

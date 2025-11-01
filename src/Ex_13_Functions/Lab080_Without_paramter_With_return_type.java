package Ex_13_Functions;

public class Lab080_Without_paramter_With_return_type {
    public static void main(String[] args) {
no_return_type();
String name=return_string_type_function();
        System.out.println(name);


    }

    static void no_return_type()
    {
        System.out.println("Hi,there,No return function!");
    }

    static String return_string_type_function()
    {
        System.out.println("Hi,there,I am returning something");
        return "Archana";
    }


}
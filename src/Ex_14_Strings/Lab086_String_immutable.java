package Ex_14_Strings;

import java.util.Locale;

public class Lab086_String_immutable {
    public static void main(String[] args) {
        String name="pramod";
        name.toUpperCase();
        System.out.println(name);  //output-name = pramod only..we cannot change string until we assign it to new ref variable
    }
}

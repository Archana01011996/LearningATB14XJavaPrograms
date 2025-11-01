package Ex_12_Programs;

public class Lab068_Palindrome_string_using_return_type {

    public static boolean isPrime(String str) {
        str = str.toLowerCase();

        for (int i = 0; i <=str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

         if (start != end) {
            return false;
        }
    }
    return true;

    }

    public static void main(String[] args) {

        String input="edfge";
        if(isPrime(input))
        {
            System.out.println("Prime number");
        }
        else {
            System.out.println("Not a prime number");
        }

    }
}

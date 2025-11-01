package Ex_12_Programs;

import java.util.Scanner;

public class Lab066_Count_vowels_and_consonants_in_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String string = sc.nextLine();
        System.out.println(string);
        int count = 0;
        int vowels_count = 0;
        int consonants_count = 0;
        //vowels=a,e,i,o,u
        //consonants-other than vowels
        string = string.toLowerCase();

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ') {
                count++;
            }
                if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u') {
                    vowels_count++;

                } else if (string.charAt(i) > 'a' || string.charAt(i) <= 'z') {
                    consonants_count++;

                }


            }



        System.out.println("Length of string is " + count);
        System.out.println("Vowels presnt in string is " + vowels_count);
        System.out.println("consonants present in string is " + consonants_count);

    }
}


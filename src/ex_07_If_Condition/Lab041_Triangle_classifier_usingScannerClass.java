package ex_07_If_Condition;

import java.util.Scanner;

public class Lab041_Triangle_classifier_usingScannerClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side 1");
        int side1 = sc.nextInt();
        System.out.println("Enter second side");
        int side2 = sc.nextInt();
        System.out.println("Enter side3");
        int side3 = sc.nextInt();

        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("Invalid input:side lengths must be positive");
        } else if (side1 == side2 && side2 == side3) {
            System.out.println("Equilateral triangle");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("Isosceles triangle");
        } else {
            System.out.println("Scalene triangle");
        }
    }
}
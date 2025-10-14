package ex_06_Increment_Decrement_op;

public class Lab034_Advance_ID {
    public static void main(String[] args) {
        int a=10;
        System.out.println(a++ + a); // 10 + 11 =21
        System.out.println(a++ + ++a); //a is 11 from previous operation so 11 + 13=24
        System.out.println(++a + ++a); //a is 13 from previous ++a=13+1 =14 + 15 =29
    }
}

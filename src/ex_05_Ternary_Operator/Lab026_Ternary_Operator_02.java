package ex_05_Ternary_Operator;

public class Lab026_Ternary_Operator_02 {
    public static void main(String[] args) {
        int age=21;
        //Nested ternary
        //result=condition1 ? expression1:(condition 2? :expression 2:expression 3);
        String result=(age>18)?(age>25)?"You can drink":"You can go to goa but no drink":"No";
        System.out.println(result);
    }
}

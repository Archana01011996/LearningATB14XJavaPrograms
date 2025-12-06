package ex_23_Wrapper;

public class Wrapper_conversion {
    public static void main(String[] args) {
        String num="10";
        int a=10;

        //String-->Wrapper
        Integer aa=Integer.parseInt(num);
        System.out.println(aa);
//        Double.parseDouble();
//        Float.parseFloat();
//        Long.parseLong();

        //String-->primitive
        int a_p=Integer.parseInt(num);
        System.out.println(a_p);

        Integer a2=Integer.valueOf("10");
        System.out.println(a2);

        //convert integer to string
        Integer a3=10;
        String s=a3.toString();
        System.out.println(s);
        System.out.println(s instanceof String);
    }
}

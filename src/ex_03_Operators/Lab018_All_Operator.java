package ex_03_Operators;

public class Lab018_All_Operator {
    public static void main(String[] args) {
        boolean b1=true;
        int a=10;
        int b=20;

        System.out.println(a+b);
        System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println(a==b);
        System.out.println(a!=b);

        //Compound operator
        int age=10;
        age +=10;  //+=age=age+10  (10+10=2)
        System.out.println(age);
        int num=10;
        num -=10;  //-= num=num-10 =0;
        System.out.println(num);
        //we can also so division and multiplication
        // num /=10  --divides number by 10
        //num*=10   --multiples number by 10
    }
}

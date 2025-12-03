package EX_19_OOPS_Polymorphism.Methodoverloading;

public class calculator {
    public static void main(String[] args) {
        calc c = new calc();
             c.add(3,5);
             c.add(10.5,11.5);
             c.add(1,2,3);
             c.add("10","20");
    }
}

    class calc{

        int add(int a,int b)
        {
            return a+b;
        }
        double add(double a,double b)
        {
            return a+b;
        }
        int add(int a,int b,int c)
        {
            return a+b+c;
        }
        long add(long a,long b,long c)
        {
            return a+b+c;
        }
        String add(String a,String b)
        {
            return a+b;
        }

    }





package ex_09_For_loop;

public class Lab054_For_loop_negative_integer {
    public static void main(String[] args) {
        for(int i=-1; i>-10;i--)
        {
            System.out.println(i);
        }

        //we can also initialize outside for loop
        int i=0;
        for(;i>0;i--)
        {
            System.out.println(i);
        }
    }
}

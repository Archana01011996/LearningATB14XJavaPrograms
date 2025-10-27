package ex_09_For_loop;

public class Lab055_odd_even_number_from_top50 {
    public static void main(String[] args) {
        for (int i=0;i<=50;i++)
        {
            if(i%2==0)
            //for odd if(i%2!=0)
            {
                System.out.println("even number "  +  i);
            }
            else
            {
                System.out.println("odd number " +  i);
            }
        }
    }
}

package ex_09_For_loop;

public class Lab056_For_loop_Even_number_using_continue {
    public static void main(String[] args) {
        for (int i = 0; i <=50; i++) {
            //for printing odd numbers
            if (i % 2 == 0) {
                continue;
            }
                System.out.println(i);
            for(int j=0;j<=50;j++)
            {
                //prints even number
                if (j % 2 != 0) {
                    continue;
            }


            System.out.println(j);
        }
    }
}}

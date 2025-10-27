package ex_11_Do_while;

public class Lab062_do_while_loop {
    public static void main(String[] args) {
        int i=11;
        while(i<10)
        {
            System.out.println(i);
            i++;
        }

        //do while exeuctes once even thouugh condition fails

        int j=11;
        do {
            System.out.println(j);
            j++;
        }
        while(j<10);

    }
}

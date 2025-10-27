package ex_09_For_loop;

public class Lab053_forloop_with_long_and_float {
    public static void main(String[] args) {
        for(long l=1l; l<10 ;l++)
        {
            System.out.println(l);
        }
        for(float f=0.0f; f<10.67;f++)
        {
            System.out.println("Hi,float ->" + f);

            // output
            //             *
            // 1           *
            // 2
            // 3
            // 4
            // 5
            // 6
            // 7
            // 8
            // 9
            // Hi,float ->0.0
            // Hi,float ->1.0
            // Hi,float ->2.0
            // Hi,float ->3.0
            // Hi,float ->4.0
            // Hi,float ->5.0
            // Hi,float ->6.0
            // Hi,float ->7.0
            // Hi,float ->8.0
            // Hi,float ->9.0
            // Hi,float ->10.0
            //
            //             *
        }
    }
}

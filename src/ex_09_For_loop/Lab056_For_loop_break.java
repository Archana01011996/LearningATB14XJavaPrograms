package ex_09_For_loop;

public class Lab056_For_loop_break {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
         //   System.out.println(i);  here output will be 0,1,2,3,4,5 (5 prints first then condition checked
            if (i==5)
                break;
            System.out.println(i);  //here output will be 0,1,2,3,4 (condition first checked then print



        }
    }
}


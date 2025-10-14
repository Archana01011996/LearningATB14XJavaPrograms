package ex_06_Increment_Decrement_op;



public class Lab032_Preincrement_op {
    public static void main(String[] args) {

        int a=10;
        int b=++a;
        System.out.println(a);  //11
        System.out.println(b);  //11
        System.out.println(++a);  //12
        System.out.println(++b);  //12s


        //Expression and result table

        // Line no  | a  | Result b
        //    8     | 10 | NA
        //    9     | 11 | 11
        //    10    | 11  | NA
        //     11    | NA  |11
      //     12     | 12  | NA
        //   13     | NA  |12
    }
}

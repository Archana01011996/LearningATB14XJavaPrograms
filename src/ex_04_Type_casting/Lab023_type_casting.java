package ex_04_Type_casting;

public class Lab023_type_casting {
    public static void main(String[] args) {
        byte b=10;
        int a=b;  //implicit -casting -widening
        //int a=(int) b  -->explicit casting in widening not required

        int a1=300;
      //  byte b1=a1;  //not possible to put bigger value in smaller variable thats where type casting comes
        byte b1=(byte) a1;//Explicit type casting -narrowing from bigger to smaller
        System.out.println(b1);
  // 300 is converted into binary
        //00000000000000101100
        //last 8 bits are considered for byte 00101100
        //binary is converted to decimal
        //(00101100)=(0*2power7)+(0*2power6)+(1*2power5)+(0*2power4)+(1*2power3)+(1*2power2)+(0*2power1)+(0*2power0)
        //              0       +      0    +     32    +    0      +      8     +   4      + 0        +     0  =44

    }
}

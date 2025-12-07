package ex_04_Type_casting;


//upcasting-automatic-converting value from smaller to larger value
// int--long
// float-->double

//downcasting-converting value from larger to smaller
//double-->float
//long-->int
public class TypecastingConcept {
    public static void main(String[] args) {
        //upcasting-->automatic/autoboxing/boxing--smaller -->
        int intvalue=100;
        long longvalue=intvalue;
        System.out.println(longvalue);

        float floatvalue=10.5F;
        double doublevalue=floatvalue;

        //downcasting//unboxing
        long l=100000;
        int i=(int)l;
        System.out.println(i);

        double d=40.7;
        float f=(float)d;
        System.out.println(f);

        double d1=10.5;
        int id=(int)d1;
        System.out.println(id);  //10
    }
}

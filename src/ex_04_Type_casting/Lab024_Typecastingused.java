package ex_04_Type_casting;

public class Lab024_Typecastingused {
    public static void main(String[] args) {
        int course=100;
        float GST=18.45f;
        //Convering from float  to int we need to put casting on float( explicit casting) bigger  to smaller here -widening
        int total =course+(int)GST;
        System.out.println(total);  //118

        //to convert to int to flaot we dont need any explicit casting -it is done implicitly
        float total2=course+GST;  //-->widening auto implicit
        System.out.println(total2);  //118.45

    }
}

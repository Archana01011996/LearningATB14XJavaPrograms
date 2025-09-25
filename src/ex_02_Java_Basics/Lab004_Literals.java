package ex_02_Java_Basics;

public class Lab004_Literals {
    public static void main(String[] args) {

        int age=65;            //Decimal System =base will be 10
        // Literal=Integral

        int binary_num=0b1010;   //Decimal System -10
        //Binary decimal

        //0ctal base ==>8
        int octal =0101;

        //Hexa decimal  literals=16
        int hex=0xface;


        final float pi =3.14f;
        //Literal =Float

        boolean is_married=true;
        boolean  is_married_amit=false;
        //Literal =Boolean

        //Character literal
        char C1='A';  //A to Z, a-z,!@#$%^&*()_+
        //char c2="A"; //String =bunch of char
        char c3='@';
        char c4=' ';
        char c5='(';
        char c6='+';
        //Escape sequence
        char new_line ='\n';
        char tab_line='\t';
        char back_space='\b';
        char carriage_return ='\r';

        System.out.println("Archana"+new_line+"Shivananda");
        System.out.println("Archana"+tab_line+"Shivananda");
        System.out.println("Archana"+back_space+"Shivananda");
        System.out.println("Archana"+carriage_return+"Shivananda");



    }
}

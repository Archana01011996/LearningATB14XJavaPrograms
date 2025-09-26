package ex_03_Operators;

public class Lab012_Interview_concat_plus {
    public static void main(String[] args) {
        int a=10;
        int b=10;
        String first_name="Archana";
        String last_name="Renuka Prasad";

        System.out.println(first_name + last_name+a+b); //First string is there it acts as concat for a and b also so we get output Archana Renukaprasad1010
        System.out.println(a+b+ first_name+last_name);//First we have a+b operation(addition -it will add and for string it changes nature and concats  name  added so we get output 20ArchanaRenukaPrasad
   //To get additon of variable we need to enter brackets to add values
        System.out.println(first_name + last_name+(a+b));  //ArchanaRenuka Prasad20

    }
}

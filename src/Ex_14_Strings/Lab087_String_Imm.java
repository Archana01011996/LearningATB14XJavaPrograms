package Ex_14_Strings;

public class Lab087_String_Imm {
    public static void main(String[] args) {

        String s1="hello";  //stored in String constant pool
        String s2=new String("Pramod");  //stored in heap Area/Object area
        s1=s1.concat("World");
        System.out.println(s1);
        System.out.println(s1.contains("dutta"));
        System.out.println(s2.concat("dutta"));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.replace('h' ,'H'));
    }
}

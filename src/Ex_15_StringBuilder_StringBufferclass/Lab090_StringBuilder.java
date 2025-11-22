package Ex_15_StringBuilder_StringBufferclass;

public class Lab090_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Archana");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.toString());

        StringBuffer sb1=new StringBuffer("RenukaPrasad");
        sb1.append(" Archana");
        System.out.println(sb1);
    }
}

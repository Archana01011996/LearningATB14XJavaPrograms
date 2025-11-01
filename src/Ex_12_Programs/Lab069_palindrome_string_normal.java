package Ex_12_Programs;

public class Lab069_palindrome_string_normal {
    public static void main(String[] args) {

        String s="madam";
        String rev="";
       int len= s.length();

        for (int i = len-1; i >=0 ; i--) {
            rev=rev+s.charAt(i);
        }
        if(rev.equals(s))
        {
            System.out.println("Its a palindrome string");
        }
        else
        {
            System.out.println("Not a palindrome string");
        }
    }
}

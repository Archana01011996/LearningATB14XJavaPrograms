package ex_05_Ternary_Operator;

public class Lab030_Real_age_classification_assigment {
 /*  public static void main(String[] args) {
        int age=59;
        String result=(age>=18)?(age<=60)?"Person is adult":"person is not adult":(age>65)?"person is senior citizen":"Minor";
        System.out.println(result); */

        //using user input from CLI-command line input

        public static void main(String[] Archana_args){
            String user_input=Archana_args[0];
            System.out.println(user_input);

            int age =Integer.parseInt(user_input);
            String result=(age<18)?"Minor":(age<=60)? "Adult":"sr.citizen";
            System.out.println(result);





    }
}

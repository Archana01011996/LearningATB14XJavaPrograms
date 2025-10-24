package ex_07_If_Condition;

public class Lab038_If {
    public static void main(String[] args) {
        String user_input=args[0];
        System.out.println(user_input);
        //int age=Integer.parseInt(args[0]);
        int age=Integer.parseInt(user_input);
        System.out.println(age);
        if(age>18)
        {
            System.out.println("Eligible to Vote");
        }
        else
        {
            System.out.println("You cannot vote");
        }

    }
}

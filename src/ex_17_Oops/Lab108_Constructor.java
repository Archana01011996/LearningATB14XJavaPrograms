package ex_17_Oops;

public class Lab108_Constructor {
    public static void main(String[] args) {
        student s1=new student();
        student s2=new student("Archana");
    }
}
class student
{
    //Default constructor
    student()
    {
        System.out.println(" DC-->Hi I am called");
    }

    student(String name)
    {
        System.out.println("Hi I am Paramterized constructor and my name is " +name);
    }
}

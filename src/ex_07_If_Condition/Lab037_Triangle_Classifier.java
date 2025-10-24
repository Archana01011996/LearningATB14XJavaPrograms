package ex_07_If_Condition;

public class Lab037_Triangle_Classifier {
    public static void main(String[] args) {

        int side1=10;
        int side2=20;
        int side3=20;

        if(side1 == side2 && side1== side3 && side2==side3)
        {
          System.out.println("Equilateral triangle") ;
        }
        else if(side1 == side2 || side1== side3 || side2==side3)
        {
            System.out.println("Iscoscles Triangle");
        }
        else {
            System.out.println("Scalene Triangle");
        }



    }
}

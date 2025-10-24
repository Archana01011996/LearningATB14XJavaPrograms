package ex_08_Switch;

public class Lab047_Above_JDK13 {
    public static void main(String[] args) {
        int itemcode=003;

        switch(itemcode)
        {
            case 001,002,003:
                System.out.println("All of them are electronic gadget");
                break;
            case 004,005,006:
                System.out.println("This is mech");
                break;
                //for single
            //    case 007-> System.out.println("007");
            default:
                System.out.println("None");
        }
    }
}

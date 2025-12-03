package EX_19_OOPS_Polymorphism.Methodoverriding;

public class Methodoverriding2 {
    public static void main(String[] args) {
        ICICI ic=new ICICI();
        System.out.println(ic.ROI());

        SBI sb=new SBI();
        System.out.println( sb.ROI());
    }


}

class Bank{
    double ROI()
    {
        return 0.0;
    }
}

class ICICI extends Bank{
    double ROI()
    {
        return 10.5;
    }
}

class SBI extends Bank{                     //Hierarchical inheritance
    double ROI()
    {
        return 11.5;
    }
}

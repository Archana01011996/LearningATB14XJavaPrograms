package ex_20_OOPS_Encapsulation;

public class Lab126_RealBank {

    public static void main(String[] args) {
        ICICI ic=new ICICI("Archana",10000000);
       long bal= ic.getBal();
        System.out.println(bal);
       // System.out.println(ic.bal);  not possible to access directly as it is private variable

        //cashier
        ICICI cashier=new ICICI("cash",100);
        cashier.setBal(200 ,true);
        System.out.println(cashier.getBal());
    }
}
class ICICI{
    private String name;
    private long bal;

    public ICICI(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

  public void setBal(long bal,boolean iscashier) {
        if (iscashier) {
            this.bal = bal;
        } else {
            System.out.println("Not allowed to set bal");
        }

   }
}

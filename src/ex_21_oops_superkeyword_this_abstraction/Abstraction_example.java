package ex_21_oops_superkeyword_this_abstraction;

public class Abstraction_example {
    public static void main(String[] args) {
        Alto a=new Alto();
        a.drive();
    }
}

abstract class car {
    abstract void startcar();
    abstract void stopcar();
}
interface Tyre
{
abstract void rubberTyre();
void blackcolourtyre();                //default all methods under interface is abstract
}

interface Gear{
    void changeGear();
}

class Alto extends car implements Tyre ,Gear {

    void drive() {
        this.startcar();
        this.rubberTyre();
        this.blackcolourtyre();
        this.changeGear();
        this.stopcar();
    }

    @Override
    void startcar() {
        System.out.println("starting car");
    }

    @Override
    void stopcar() {
        System.out.println("Stopping car");
    }

    @Override
    public void rubberTyre() {
        System.out.println("rubbing of tyre once car started");
    }

    @Override
    public void blackcolourtyre() {
        System.out.println("Tyre type is black color  ");
    }

    @Override
    public void changeGear() {
        System.out.println("change the gear to move ");
    }



}
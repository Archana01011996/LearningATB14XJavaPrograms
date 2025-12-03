package EX_19_OOPS_Polymorphism.Methodoverloading;

public class WenUIAutomation {
    public static void main(String[] args) {
      //  Browser b=new Browser ();
        Browser b=new Browser ();
        b.startBrowser();
        b.startBrowser("chrome");

    }
}


class Browser{
    void startBrowser()
    {
        System.out.println("Default browser is started");
    }

    void startBrowser(String browser)
    {
        System.out.println("Starting browser "+ browser);
    }
}

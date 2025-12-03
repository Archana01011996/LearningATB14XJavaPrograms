package ex_21_oops_superkeyword_this_abstraction;

public class Superkeyword {

}

class Baseclass{

    Baseclass()
    {
        System.out.println("Default constructor-parent");
    }
    Baseclass(String browser)
    {
        this.browser=browser;
        System.out.println("Parameterized constructor");
    }

    private String browser;

    public String getBrowser()
    {
        return browser;
    }
    public void setBrowser(String browser)
    {
        this.browser=browser;
    }
    void openBrowser()
    {
        System.out.println("Opening browser");
    }
    void openBrowser(String browser)
    {
        System.out.println("Open browser " + browser);
    }
    void closeBrowser()
    {
        System.out.println("Close Browser");
    }

}

class Testcase extends Baseclass{

    void testc()
    {

    }

    Testcase()
    {
      //  super();
        super("chrome");
        super.getBrowser();
        super.openBrowser();
        super.setBrowser("chrome");
        super.closeBrowser();
    }

}




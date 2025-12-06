package ex_22_Enum;

public class Enump3 {
    public static void main(String[] args) {
        System.out.println(Locators.page_input_email.getLocators());
    }
}
enum Locators{
    page_input_email("//*[@id=\"login-username\"]"),
    page_input_password("//*[@id=\"login-password\"]"),
    page_button("//*[@id=\"js-login-btn\"]");

    private String locators;
    Locators(String locator){
        this.locators=locator;
    }
    public String getLocators()
    {
        return locators;
    }

    public void setLocators(String locators) {
        this.locators = locators;
    }
}
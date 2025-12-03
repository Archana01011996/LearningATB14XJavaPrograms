package ex_20_OOPS_Encapsulation;

public class Lab125_Encapdemo {
    public static void main(String[] args) {
        VMOLogin vmologin=new VMOLogin("Admin" ,"pwd123" );
       String un= vmologin.getUsername();
        System.out.println(un);
        String pwd= vmologin.getPassword();
        System.out.println(pwd);

    }
}

class VMOLogin {
    private String username;
    private String password;


    VMOLogin(String un,String pwd)
    {
        this.username=un;
        this.password=pwd;
      //  System.out.println(un);
        //System.out.println(pwd);
    }

    public String getUsername()
    {
        return username;
    }
    public void setUsername(String un)
    {
        this.username=un;
    }

    public String getPassword()
    {
        return password;
    }
    public void setPassword(String pwd,boolean isGoodAuntyadmin)
    {
        if(isGoodAuntyadmin)
        {
            this.password=pwd;
        }
        else {
            System.out.println("Not allowed to change pwd");
        }
    }


}


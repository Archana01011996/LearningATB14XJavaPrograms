package ex_22_Enum;

public class Enump2 {
    public static void main(String[] args) {
        System.out.println(HEX_COLORs.RED.getHexcode());
    }
}

enum HEX_COLORs{
    RED("#FF000"),GREEN("#61FF33"),BLUE("3377FF"),YELLOW("#4477FF");

    private String hexcode;
    HEX_COLORs(String hexcode) {
        this.hexcode=hexcode;
    }
    public String getHexcode()
    {
        return hexcode;
    }

    public void setHexcode(String hexcode) {
        this.hexcode = hexcode;
    }
}

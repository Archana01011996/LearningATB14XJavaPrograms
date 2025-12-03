package ex_21_oops_superkeyword_this_abstraction;

public class This_keyword {
    int x, y;   //class variable

  This_keyword(int x, int y) {
    this.x = x;
     this.y = y;

    }
    void display()
    {
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
        This_keyword tk = new This_keyword(10,20);
          tk.display();
    }


}

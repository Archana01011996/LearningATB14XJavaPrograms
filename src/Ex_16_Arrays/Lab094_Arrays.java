package Ex_16_Arrays;

public class Lab094_Arrays {
    public static void main(String[] args) {
        int [] marks={91,92,93,94,95,100,100};
        boolean b[]={true,false,true};

        System.out.println(marks.length);

        System.out.println(marks[0]);
        System.out.println(marks[5]);

      //  System.out.println(marks[-1]);  //java.lang.ArrayIndexOutOfBoundsException

        String name="Pramod";
       String[] name_each_elemet_char= name.split("");
        System.out.println(name_each_elemet_char);
        for(String s:name_each_elemet_char)
        {
            System.out.println(s);
        }


    }
}

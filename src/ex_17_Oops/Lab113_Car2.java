package ex_17_Oops;

public class Lab113_Car2 {
    String model;
    int year;

    Lab113_Car2()
    {
        model="xxx";
        year=1900;
        System.out.println("DC");
    }



    Lab113_Car2(String model_name)
    {
        System.out.println( this.model=model_name);
    }
Lab113_Car2(String model_name,int year_created)
{
    this(model_name="i20");  //constructor chaining
    this.model=model_name;
    this.year=year_created;

}
}

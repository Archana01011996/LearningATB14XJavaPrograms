package EX_19_OOPS_Polymorphism.Methodoverloading;

public class Box {
    double width,height,depth;
    Box()
    {
        width=height=depth=0;
    }
    Box(double w,double h,double d)
    {
        width=w;
        height=h;
        depth=d;
    }
    Box(double len)
    {
        width=height=depth=len;
        System.out.println(len);
    }
    double volume()
    {
        return width*depth*height;
    }
}

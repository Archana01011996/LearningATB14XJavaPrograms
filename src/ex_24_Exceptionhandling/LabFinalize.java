package ex_24_Exceptionhandling;

public class LabFinalize {
    public static void main(String[] args) {
        LabFinalize labFinalize =new LabFinalize();
        labFinalize=null;
        System.gc();
        System.out.println("Main method done");
    }
    public void finalize()
    {
        System.out.println("Finalize method called before GC");
    }
}

package Ex_16_Arrays;

public class Lab098_Sum_of_Array {
    public static void main(String[] args) {
        int a[]={20,45,348,94,34};
        int sum=0;
        for (int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        System.out.println(sum);
    }
}

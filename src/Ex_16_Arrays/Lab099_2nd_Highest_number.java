package Ex_16_Arrays;

import java.util.Arrays;

public class Lab099_2nd_Highest_number {
    public static void main(String[] args) {
        int a[]={ 12,34,10,1,100,2,4,32};

        //using arrays
        Arrays.sort(a);
        for(int arr:a)
        {
            System.out.print(arr);
        }
        System.out.println();

        System.out.println(a[a.length-2]);

        //
    }
}

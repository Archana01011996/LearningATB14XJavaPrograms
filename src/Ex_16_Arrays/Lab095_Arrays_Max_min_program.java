package Ex_16_Arrays;

import java.util.Arrays;

public class Lab095_Arrays_Max_min_program {
    public static void main(String[] args) {

        int array[]={25,14,56,15,36,77,18,29,49};

        //using built in
        Arrays.sort(array);
        System.out.println(array[array.length-1]);

        int max=array[0];
        int min=array[0];
        for(int i=1;i< array.length;i++)
        {
            if(array[i]>max)
            {
               max=array[i];
            }
        }
        System.out.println(max);
//for minimum number
        for(int j=1;j< array.length;j++)
        {
            if(array[j]<min)
            {
                min=array[j];
            }
        }
        System.out.println(min);







    }
}

package Ex_12_Programs;

public class Lab103_mirror_right_angle_triangle {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print("-" + " |");
            }
            for(int k=n-i;k<n;k++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }


    }
}

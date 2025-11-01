package Ex_12_Programs;

public class Lab074_Right_Tirangle_star_pattern {
    public static void main(String[] args) {

        int n = 5;
        for (int i = 1; i <= n; i++)
        {
            for(int j=1; j<=i ;j++)
            {
                System.out.print("*");
            }

            System.out.println();

        }

    }
}

//WAP that will take (n x n) integer inputs into a square matrix of dimension n (where n must be an odd number). Then calculate sum of the integers based on following position pattern (consider only the boxed position during the sum). Please see the input-output.
import java.util.Scanner;
public class SL11 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int[][] a=new int[50][50];
        int row_column_size,i,j,sum=0;

        row_column_size= input.nextInt();
        if (row_column_size % 2 != 0)
        {
            for ( i = 0; i < row_column_size; i++)
            {
                for (j = 0; j < row_column_size; j++)
                {
                    a[i][j]= input.nextInt();
                }
            }

            System.out.println();
            for ( i = 0; i < row_column_size; i++)
            {
                for (j = 0; j < row_column_size; j++)
                {
                    if (i%2!=0)
                    {
                        sum = sum + a[i][j];
                    }
                }
            }
            for (i = 0; i < row_column_size; i=i+2)
            {
                for (j = 0; j < row_column_size; j++)
                {
                    if (j % 2 != 0)
                    {
                        sum = sum + a[i][j];
                    }
                }
            }
            System.out.println(sum);

        }
        else
        {
            System.out.println("Only odd integer expected");
        }
    }
}
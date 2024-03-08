//WAP that will take (n x n) integer inputs into a square matrix of dimension n (where n must be an odd number). Then calculate sum of the integers based on following position pattern (consider only the boxed position during the sum). Please see the input-output.
import java.util.Scanner;
public class SL10 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int[][] a=new int[50][50];
        int i, j, sum = 0, row_column_size = 0;
        row_column_size= input.nextInt();
        int r = row_column_size / 2;
        if (row_column_size > 0 && row_column_size % 2 != 0)
        {
            for (i = 0; i < row_column_size; i++)
            {
                for (j = 0; j < row_column_size; j++)
                {
                    a[i][j]= input.nextInt();
                }
            }
            i = 0;
            for (j = 0; j <= r; j++)
            {
                sum = sum + a[i][j];
            }
            j = r;
            for (i = 0; i < row_column_size; i++)
            {
                sum = sum + a[i][j];
            }
            j = row_column_size - 1;
            for (i = 0; i < r; i++)
            {
                sum = sum + a[i][j];
            }
            i = r;
            for (j = 0; j < row_column_size; j++)
            {
                sum = sum + a[i][j];
            }
            j = 0;
            for (i = r + 1; i < row_column_size; i++)
            {
                sum = sum + a[i][j];
            }
            i = row_column_size - 1;
            for (j = r; j < row_column_size; j++)
            {
                sum = sum + a[i][j];
            }
            sum = sum - a[0][r] - a[r][r] - a[row_column_size - 1][r];
            System.out.println();
            System.out.println(sum);
        }
        else
        {
            System.out.println("Only odd integer expected.");
        }
    }
}
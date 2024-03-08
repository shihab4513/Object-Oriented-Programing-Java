//WAP that will take (n x n) integer inputs into a square matrix of dimension n (where n must be an odd number). Then calculate sum of the integers at first row, last row and two diagonals without overlap. Please see the sample input-output.
import java.util.Scanner;
public class SL9 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int[][] a=new int[50][50];
        int i, j, row_column_size, sum = 0;

        row_column_size= input.nextInt();
        for (i = 0; i < row_column_size; i++)
        {
            for (j = 0; j < row_column_size; j++)
            {
                a[i][j]= input.nextInt();
            }
        }
        i = 0;
        for (j = 0; j < row_column_size; j++)
        {
            sum = sum + a[i][j];
        }
        i = row_column_size - 1;
        for (j = 0; j < row_column_size; j++)
        {
            sum = sum + a[i][j];
        }

        for (i = 1; i < row_column_size - 1; i++)
        {
            for (j = 1; j < row_column_size - 1; j++)
            {
                if (i == j)
                {
                    sum = sum + a[i][j];
                }
                if (i + j == row_column_size - 1)
                {
                    sum = sum + a[i][j];
                }
            }
        }
        // removing repeated summed number.
        int r = row_column_size / 2;
        sum = sum - a[r][r];
        System.out.println("\n"+sum);

    }
}
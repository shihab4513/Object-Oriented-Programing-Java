//WAP that will take inputs of two 3 x 3 sized matrix into two 2D array, suppose A and B. Now do C = A * B (multiplication). Finally display all the elements from matrix / 2D array C.
import java.util.Scanner;
public class SL7 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int[][] A=new int[50][50];
        int[][] B=new int[50][50];
        int[][] C=new int[50][50];
        int i, j, k, row_column_size=3;
        for ( i = 0; i < row_column_size; i++)
        {
            for (j = 0; j < row_column_size; j++)
            {
                A[i][j]= input.nextInt();
            }
        }
        for (i = 0; i < row_column_size; i++)
        {
            for (j = 0; j < row_column_size; j++)
            {
                B[i][j]= input.nextInt();
            }
        }
        System.out.println();
        for (i = 0; i < row_column_size; i++)
        {
            for (j = 0; j < row_column_size; j++)
            {
                int sum = 0;
                for ( k = 0; k < row_column_size; k++)
                {
                    sum = sum + A[i][k] * B[k][j];

                }
                C[i][j] = sum;

            }
        }

        for (i = 0; i < row_column_size; i++)
        {
            for (j = 0; j < row_column_size; j++)
            {
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
    }
}
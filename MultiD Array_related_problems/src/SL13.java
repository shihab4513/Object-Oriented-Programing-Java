//WAP that will take (n x n) integer inputs into a square matrix of dimension n. Now determine whether the matrix is symmetric or not.
import java.util.Scanner;
public class SL13 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int[][] a=new int[50][50];
        int i, j, row_column_size, count = 0;
        row_column_size= input.nextInt();
        for (i = 0; i < row_column_size; i++)
        {
            for (j = 0; j < row_column_size; j++)
            {
                a[i][j]= input.nextInt();
            }
        }
        for (i = 0; i < row_column_size; i++)
        {
            for (j = 0; j < row_column_size; j++)
            {
                if (a[i][j] == a[j][i])
                {

                    count++;
                }
            }
        }
        System.out.println();
        if (row_column_size * row_column_size == count)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
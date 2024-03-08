//WAP that will take (m x n) integers into a m by n array (2D) and print them both row-wise and column-wise.
import java.util.Scanner;
public class SL2 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int[][] a=new int[100][100];
        int  row_size, column_size, row, column;
        row_size= input.nextInt();
        column_size= input.nextInt();
        for (row = 0; row < row_size; row++)
        {
            for (column = 0; column < column_size; column++)
            {
                a[row][column]= input.nextInt();
            }
        }
        System.out.print("Row-wise: ");
        for (row = 0; row < row_size; row++)
        {
            for (column = 0; column < column_size; column++)
            {
                System.out.print(a[row][column]+" ");
            }
        }
        System.out.println();
        System.out.print("Column-wise: ");
        for (column = 0; column < column_size; column++)
        {
            for (row = 0; row < row_size; row++)
            {
                System.out.print(a[row][column]+" ");
            }
        }

    }
}
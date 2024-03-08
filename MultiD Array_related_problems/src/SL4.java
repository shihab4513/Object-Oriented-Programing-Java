//WAP that will take inputs of a n sized square matrix into a 2D array. Now show all the elements of its two diagonals.
import java.util.Scanner;
public class SL4 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int[][] a=new int[100][100];
        int row, column, row_column_size;
        row_column_size= input.nextInt();
        for (row = 0; row < row_column_size; row++)
        {
            for (column = 0; column < row_column_size; column++)
            {
                a[row][column]= input.nextInt();
            }
        }
        System.out.print("Major diagonal: ");
        for (row = 0; row < row_column_size; row++)
        {
            for (column = 0; column < row_column_size; column++)
            {
                if (row==column)
                {
                    System.out.print(a[row][column]+" ");
                }
            }
        }
        System.out.print("\nMinor diagonal: ");
        for ( row = 0,column=row_column_size-1; row<row_column_size; row++,column--)
        {
            System.out.print(a[row][column]+" ");;
        }

    }
}
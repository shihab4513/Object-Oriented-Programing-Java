//WAP that will take the size of an identity matrix from the user and generate the identity matrix into a 2D array. Finally display it.
import java.util.Scanner;
public class SL5 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int[][] a=new int[50][50];
        int row, column, row_column_size;
        row_column_size= input.nextInt();
        for (row = 0; row < row_column_size; row++)
        {
            for (column = 0; column < row_column_size; column++)
            {
                if (row==column)
                {
                    a[row][column] = 1;

                }
                else if(row!=column)
                {
                    a[row][column] = 0;
                }
                System.out.print(a[row][column]+" ");
            }
            System.out.println();
        }
    }
}
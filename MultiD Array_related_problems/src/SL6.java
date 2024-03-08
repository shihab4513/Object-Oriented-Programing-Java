//WAP that will take inputs of two m x n sized matrix into two 2D array, suppose A and B. Now do C = A + B. Finally display all the elements from matrix / 2D array C.
import java.util.Scanner;
public class SL6 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int[][] A=new int[30][30];
        int[][] B=new int[30][30];
        int[][] C=new int[30][30];
        int row, column, row_size, column_size;
        row_size= input.nextInt();
        column_size= input.nextInt();
        for (row = 0; row < row_size; row++)
        {
            for (column = 0; column < column_size; column++)
            {
                A[row][column]= input.nextInt();
            }
        }
        for (row = 0; row < row_size; row++)
        {
            for (column = 0; column < column_size; column++)
            {
                B[row][column]= input.nextInt();
            }
        }
        System.out.println();
        for (row = 0; row < row_size; row++)
        {
            for (column = 0; column < column_size; column++)
            {
                C[row][column] = A[row][column] + B[row][column];
                System.out.print(C[row][column]+" ");
            }
            System.out.println();
        }
    }
}
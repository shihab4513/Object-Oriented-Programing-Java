//WAP that will take (m x n) integer inputs into a matrix of dimension m x n. Now reverse that matrix within itself and display it. Reversal means swap 1st column with the nth column, swap 2nd column with the (n-1)th column and so on…
import java.util.Scanner;
public class SL12 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int[][] a=new int[50][50];
        int i, j,row,column;
        row= input.nextInt();
        column= input.nextInt();
        for ( i = 0; i < row; i++)
        {
            for (j = 0; j < column; j++)
            {
                a[i][j]= input.nextInt();
            }
        }
        System.out.println();
        for (i = 0; i < row; i++)
        {
            for (j = column-1; j >=0; j--)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
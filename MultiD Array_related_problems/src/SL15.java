//WAP that will take (m x n) integer inputs into a matrix of dimension m x n. Now just simply add all the integers in that matrix and show the result.
import java.util.Scanner;
public class SL15 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int[][] a=new int[50][50];
        int i,j,row_size,column_size,sum=0;
        row_size= input.nextInt();
        column_size= input.nextInt();
        for ( i = 0; i < row_size; i++)
        {
            for (j = 0; j < column_size; j++)
            {
                a[i][j]= input.nextInt();
            }
        }
        System.out.println();
        for (i = 0; i < row_size; i++)
        {
            for (j = 0; j < column_size; j++)
            {
                sum = sum + a[i][j];

            }
        }
        System.out.println(sum);
    }
}
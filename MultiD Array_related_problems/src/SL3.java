//WAP that will take inputs of a 3 by 3 matrix into a 2D array. Now find the determinant of this matrix.
import java.util.Scanner;
public class SL3 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int[][] a=new int[10][10];
        int  row, column,det=0;
        for (row = 0; row < 3; row++)
        {
            for (column = 0; column <3 ; column++)
            {
                a[row][column]= input.nextInt();
            }
        }
        for (int i = 0; i < 3; i++)
            det = det + (a[0][i] * (a[1][(i + 1) % 3] * a[2][(i + 2) % 3] - a[1][(i + 2) % 3] * a[2][(i + 1) % 3]));

        System.out.println("The Determinant of the matrix is: "+det);
    }
}
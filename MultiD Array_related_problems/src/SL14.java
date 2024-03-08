//WAP that will take (m x n) positive integer inputs into a matrix of dimension m x n. Now replace all the duplicate integers by -1 in that matrix. Finally display it.
import java.util.Scanner;
public class SL14 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int[][] a=new int[50][50];
        int i, j, x, y, row_size, column_size;
        row_size= input.nextInt();
        column_size= input.nextInt();
        for (i = 0; i < row_size; i++)
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
                for (x = 0; x < row_size; x++)
                {
                    for (y = 0; y < column_size; y++)
                    {

                        if (x == i && y == j)
                        {
                            continue;
                        }
                        else if (a[x][y] == a[i][j])
                        {
                            a[x][y] = -1;
                        }

                    }
                }
            }
        }
        for (i = 0; i < row_size; i++)
        {
            for (j = 0; j < column_size; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
//WAP that will take inputs of m x n sized matrix into a 2D array and find the maximum element with index locationfrom that matrix.
import java.util.Scanner;
public class SL8 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int[][] a=new int[50][50];
        int i,j,row_size,column_size,largest=a[0][0], indexM = 0, indexN = 0;
        row_size= input.nextInt();
        column_size=input.nextInt();
        for (i = 0; i < row_size; i++)
        {
            for (j = 0; j < column_size; j++)
            {
                a[i][j]=input.nextInt();
            }
        }
        for (i = 0; i < row_size; i++)
        {

            for (j = 0; j < column_size; j++)
            {
                if (a[i][j]>largest)
                {
                    largest = a[i][j];
                    indexM = i;
                    indexN = j;
                }
            }
        }

        System.out.println("Max: "+largest);
        System.out.println("Location: ["+indexM+"]["+indexN+"]" );
    }
}
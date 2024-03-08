package shihab;
import java.util.Scanner;
public class demo{
    public static void main(String[] args)
    {
        Scanner shihab=new Scanner(System.in);
        //int[] a;
        //double[] b;
        //a=new int[10];
        //b=new double[10];
        //a = new int[]{1, 2, 3, 4, 5};
      // a[0]=5;
       //b[1]=5.5;
        //System.out.println(a[0]);
        //System.out.println(b[1]);
       // int[][] twoD;
       // twoD=new int[5][5];
       // for (int i = 0; i < 4; i++) {
       //     for (int j = 0; j < 4; j++) {
       //         twoD[i][j]=shihab.nextInt();
       //     }
       // }
//
       // for (int i = 0; i < 4; i++) {
       //     for (int j = 0; j < 4; j++) {
       //         System.out.print(twoD[i][j]+" ");
       //     }
       //     System.out.println();
       // }

        for(int i=0; i<10; i++) {
            System.out.print(i + " ");
            if (i%2 == 0) continue;
            System.out.println("");
        }



    }
}
import java.util.Scanner;
public class SL12 {
    static int findMinimum(int[] a,int n)
    {
        int min=a[0];
        for (int i = 0; i <n ; i++) {
            if (a[i]<min){
                min=a[i];
            }
        }
       return min;
    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n,r;
        int[] a=new int[100];
        n= input.nextInt();
        for (int i = 0; i <n ; i++) {
            a[i]= input.nextInt();
        }
        r=findMinimum(a,n);
        System.out.println("Minimum value is: "+r);
    }
}

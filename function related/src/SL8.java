import java.util.Scanner;
public class SL8 {
    static void reverseOrder(int[] x,int n){
        for (int i = n-1; i >=0 ; i--) {
            System.out.print(x[i]+" ");
        }
    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int[] a=new int[100];
        int n;
        n= input.nextInt();
        for (int i = 0; i <n ; i++) {
            a[i]= input.nextInt();
        }
        reverseOrder(a,n);
    }
}

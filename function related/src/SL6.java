import java.util.Scanner;
public class SL6 {
    static void sum(int[] x,int n){
        int sum=0;
        for (int i = 0; i <n ; i++) {
            sum=sum+x[i];
        }
        System.out.println("Sum in function: "+sum);
    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int[] a=new int[100];
        int sum=0;
        int n= input.nextInt();


        for (int i = 0; i <n ; i++) {
            a[i]= input.nextInt();
        sum=sum+a[i];
        }

    sum(a,n);

        System.out.println("Sum in main: "+sum);
    }
}

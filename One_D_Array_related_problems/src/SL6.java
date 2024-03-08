import java.util.Scanner;
public class SL6 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int  n, i, max,min;
        int[] a=new int[100];
        n= input.nextInt();
        for (i = 0; i < n; i++) {
            a[i]= input.nextInt();
        }
        max = a[0];
        min=a[0];
        for (i = 1; i < n; i++) {
            if (a[i]>max) {
                max = a[i];
            } else if (a[i]<min) {
                min=a[i];
            }
        }
        for ( i = 0; i <n ; i++) {
            if (max==a[i]){
                System.out.println("Max: "+a[i]+", Index: "+i);
            } else if (a[i]==min) {
                System.out.println("Min: "+a[i]+", Index: "+i);

            }
        }

    }
}
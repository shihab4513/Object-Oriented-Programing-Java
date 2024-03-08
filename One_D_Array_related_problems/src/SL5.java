//WAP that will take n integer numbers into an array, and then reverse all the integers within that array. Finally print them all from 0 index to last valid index.
import java.util.Scanner;
public class SL5 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int[] a=new int[100];
        int[] temp=new int[100];
        int n;
        n= input.nextInt();
        for (int i = 0; i <n ; i++) {
            a[i]= input.nextInt();
        }
        for (int i = 0,j=n-1; i <n ; i++) {
            temp[i]=a[j];
            j--;
        }
        for (int i = 0; i <n ; i++) {
            a[i]=temp[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }

    }
}
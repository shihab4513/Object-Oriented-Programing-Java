//WAP that will take n integer numbers into an array, and then print all the integers into reverse order (from the last valid index to index 0).
import java.util.Scanner;
public class SL1 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int a[]=new int[100];
        int n;
        n= input.nextInt();
        for (int i = 0; i <n ; i++) {
            a[i]= input.nextInt();
        }
        for (int i = n-1; i >=0 ; i--) {
            System.out.print(a[i]+" ");
        }
    }
}
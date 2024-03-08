//WAP that will take n integers into an array A, and then copy all numbers in reverse order from array A to another array B. Finally show all elements of both array A and B.
import java.util.Scanner;
public class SL9 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int[] A=new int[100];
        int[] B=new int[100];
        int n;
        n= input.nextInt();
        for (int i = 0; i <n ; i++) {
            A[i]= input.nextInt();
        }
        for (int i = 0,j=n-1; i <n ; i++,j--) {
            B[j]=A[i];
        }
        System.out.print("Array A: ");
        for (int i = 0; i <n ; i++) {
            System.out.print(A[i]+" ");
        }
        System.out.println();
        System.out.print("Array B: ");
        for (int i = 0; i <n ; i++) {
            System.out.print(B[i]+" ");
        }
    }
}
//WAP that will first take n integers into an array A and then m integers into array B. Now swap all elements between array A and B. Finally show all elements of both array A and B.
import java.util.Scanner;
public class SL10 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int[] A=new int[100];
        int[] B=new int[100];
        int[] temp=new int[100];
        int n1,n2;
        n1= input.nextInt();

        for (int i = 0; i <n1 ; i++) {
            A[i]= input.nextInt();
        }
        n2= input.nextInt();
        for (int i = 0; i <n2 ; i++) {
            B[i]= input.nextInt();
        }
        for (int i = 0; i <n1||i<n2 ; i++) {
            temp[i]=A[i];
            A[i]=B[i];
            B[i]=temp[i];
        }

        System.out.print("A: ");
        for (int i = 0; i<n2; i++) {
            System.out.print(A[i]+" ");
        }
        System.out.println();
        System.out.print("B: ");
        for (int i = 0; i <n1 ; i++) {
            System.out.print(B[i]+" ");
        }
    }
}
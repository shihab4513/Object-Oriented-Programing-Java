//WAP that will take n positive integers into an array A. Now find all the integers that are divisible by 3 and replace them by -1 in array A. Finally show all elements of array A.
import java.util.Scanner;
public class SL11 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int[] a=new int[100];
        int n;
        n= input.nextInt();
        for (int i = 0; i <n ; i++) {
            a[i]= input.nextInt();
        }
        for (int i = 0; i <n ; i++) {
            if (a[i]%3==0){
                a[i]=-1;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }

    }
}
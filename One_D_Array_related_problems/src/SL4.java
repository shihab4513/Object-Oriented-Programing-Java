//WAP that will take n integer numbers into an array, and then sum up all the even indexed integers in that array.
import java.util.Scanner;
public class SL4 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int a[]=new int[100];
        int sum=0,n;
        n=input.nextInt();
        for (int i = 0; i <n ; i++) {
            a[i]= input.nextInt();
            if (i%2==0) {
                sum = sum + a[i];
            }
        }
        System.out.println(sum);

    }
}
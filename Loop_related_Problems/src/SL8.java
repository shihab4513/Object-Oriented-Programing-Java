//Write a program (WAP) that will reverse the digits of an input integer.
import java.util.Scanner;
public class SL8 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n,rem=0;
        n=input.nextInt();
        for (int i = n; i >0 ; i=i/10) {
            rem=i%10;
            System.out.print(rem);
        }

    }
}
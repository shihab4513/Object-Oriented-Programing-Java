//WAP that will take n integers into an array, and then search a number into that array. If found then print its index. If not found then print “NOT FOUND”.
import java.util.Scanner;
public class SL8 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int[] a=new int[100];
        int n,x,count=0;
        n= input.nextInt();
        for (int i = 0; i <n ; i++) {
            a[i]= input.nextInt();
        }
        System.out.println("Index you want to search: ");
        x= input.nextInt();
        for (int i = 0; i <n ; i++) {
            if (count==0){
                System.out.println("Found at index position: ");
                count++;
            } else if (x==a[i]) {
                System.out.print(i+",");

            }

        }
        if (count==0){
            System.out.println("NOT FOUND.");
        }

    }
}
//Write a program (WAP) that will print following series upto Nth terms.
//1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, …….
import java.util.Scanner;
public class SL1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        System.out.println("Enter input: ");
        n=input.nextInt();
        System.out.println("Output: ");
        for (int i = 1; i <=n ; i++) {
            System.out.println(i);
        }

    }
}
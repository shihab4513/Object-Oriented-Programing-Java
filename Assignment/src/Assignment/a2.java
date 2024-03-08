//2.   Write java program to find sum of all digits. Input 23617 output 2+3+6+1+7 =19.
package Assignment;



import java.util.Scanner;

public class a2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter number: ");
        n = in.nextInt();
        int rev = 0, i, sum = 0;
        for (i = n; i != 0; i = i / 10) {
            sum = sum + i % 10;
            rev = rev * 10 + (i % 10);
        }
        for (i = rev; i != 0; i = i / 10) {
            System.out.print(i % 10);
            if (i > 0) {
                System.out.print("+");
            }
        }

        System.out.print("=");
        System.out.print(+sum);
    }
}


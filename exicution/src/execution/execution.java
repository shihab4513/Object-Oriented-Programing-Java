package execution;
import java.util.Scanner;

public class execution {
    public static void main(String[] args){
        System.out.println("Hello");
        int rem;
        Scanner in=new Scanner (System.in);
        System.out.println("Enter number: ");
         int n=in.nextInt();
        for (int i=n;i>0;i=i/10)
        {
            rem=i%10;
            System.out.print(+rem);
        }
    }
}

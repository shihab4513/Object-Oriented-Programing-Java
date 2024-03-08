package shihab;
import java.util.Scanner;

public class second {
    public static void main(String[] args)
    {
        int n,count=0,i,rem=0;
        Scanner in=new Scanner(System.in);

        System.out.println("Enter input: ");
        n= in.nextInt();
        for (i=n;i>0;i=i/10)
        {
            count++;
        }
        for (i=0;i<count;i++)
        {
            rem=n%10;
            n=n/10;
        }
        System.out.println(+rem);

    }
}

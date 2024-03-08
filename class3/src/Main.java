import java.util.*;

public class Main {
  static int siamChecker(int x)
    {
        int rem=0,sum=0;
        for (int i = x; i >0 ; i=i/10) {
            rem=i%10;
            sum=sum+rem;

        }
        if (sum*sum%3==0){
           return 1;
        }
        else
            return 0;

    }
    public static void main(String[] args) {

        int x;
        Scanner siam=new Scanner(System.in);
        x= siam.nextInt();
        int r=siamChecker(x);
        if (r==1)
        {
            System.out.println("Accepted");
        } else if (r==0) {
            System.out.println("Not accepted");
        }

    }
}














import java.util.Scanner;
public class SL7 {
    static int factorial(int a){
        int rem=0,fact=1;
        for (int i = a; i>0 ;i--) {
            fact=fact*i;
        }
        return fact;

    }


    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int r=factorial(n);
        System.out.println(r);
    }
}

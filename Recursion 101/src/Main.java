import java.util.*;
public class Main {
    public static void factorial(int n,int fact) {

        if (n == 0) {
            System.out.println("Factorial is: "+fact);
            return;
        }
        else {
             fact=fact*n;
            factorial(n - 1,fact);
          //  System.out.println(n);
        }
    }
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     int n=input.nextInt();
     int fact=1;
     factorial(n,fact);


    }

}
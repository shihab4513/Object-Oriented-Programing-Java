//Write a program (WAP) that will take two numbers X and Y as inputs. Then it will print the square of X and increment (if X<Y) or decrement (if X>Y) X by 1, until X reaches Y. If and when X is equal to Y, the program prints “Reached!”
import java.util.Scanner;
public class SL5 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n1,n2,x,y;
        System.out.println("Enter first input: ");
        n1=input.nextInt();
        System.out.println("Enter second input: ");
        n2= input.nextInt();
        x=n2*n2;

       if(n1>n2) {
           for (int i = n1; i < x; i--) {
               int r = i * i;
               if (i == n2) {
                   System.out.println("Reached!");
                   break;
               }
               System.out.print(r + ",");

           }
       } else if (n1<n2) {
           for (int i = n1; i <x ; i++) {
               int r2=i*i;
               if (i==n2){
                   System.out.println("Reached!");
                   break;
               }
               System.out.print(r2+",");
           }
       } else if (n1==n2) {
           System.out.println("Reached!");

       }


    }

}

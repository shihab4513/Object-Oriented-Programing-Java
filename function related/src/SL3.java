import java.util.Scanner;
public class SL3 {
    static int EvenOddChecker(int n){
      if (n%2==0){
          return 1;
      }
      else {
          return 0;
      }
    }
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      int n;
      n= input.nextInt();
      int r=EvenOddChecker(n);
      if (r==1){
          System.out.println("Even");
      }
      else {
          System.out.println("Odd");
      }

    }
}
import java.util.Scanner;
public class SL4 {
    static void NumberChecker(int n){
        if (n>0){
            System.out.println("Positive");
        } else if (n<0) {
            System.out.println("Negative");

        }
        else {
            System.out.println("Zero");
        }

    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n;
        n= input.nextInt();
        NumberChecker(n);

    }
}

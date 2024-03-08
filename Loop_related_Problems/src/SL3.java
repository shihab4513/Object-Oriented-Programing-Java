//Write a program (WAP) that will print following series upto Nth terms.
//1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, …….
import java.util.Scanner;
public class SL3 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter input: ");
        int n=input.nextInt();
        for (int i = 1; i <=n ; i++) {
            if (i%2==0){
                System.out.print("0,");
            } else if (i%2!=0) {
                System.out.print("1,");
            }
        }
    }

}

//Write a program (WAP) that will print following series upto Nth terms.
//1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31 …….
import java.util.Scanner;
public class SL2 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter new input: ");
        int n=input.nextInt();
        System.out.println("Output:");
        for (int i = 1; i <=n ; i++) {
            if (i%2!=0){
                System.out.println(i);
            }
            else {
                n++;
            }
        }


    }

}

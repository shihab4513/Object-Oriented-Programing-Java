//Write a program (WAP) that will run and show keyboard inputs until the user types an ’A’ at the keyboard.
import java.util.Scanner;
public class SL7 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        char a;
        int count=1;
        boolean x=true;
        while (x){

            a=input.next().charAt(0);
            if(a!='A') {
                System.out.println("Input " + count + ": " + a);
            }
            if (a=='A'){
                break;
            }
            count++;

        }
    }
}
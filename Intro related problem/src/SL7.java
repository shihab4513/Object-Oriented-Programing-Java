//Program that will receive the values of an integer, a floating point number, a character from
//the keyboard and print those values.
import java.util.Scanner;
public class SL7 {

    public static void main(String[] args){

        int a;
        float f;
        String s;
        Scanner input=new Scanner(System.in);
        a= input.nextInt();
        f= input.nextFloat();
        s= input.next();
        System.out.println();
        System.out.println(a);
        System.out.println(f);
        System.out.println(s);


    }

}

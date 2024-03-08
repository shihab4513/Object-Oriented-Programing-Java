//Program that will take three integer numbers from keyboard but assign only the first and
//last inputs to variables and skip any assignment of the middle one.
import java.util.Scanner;
public class SL8 {
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner input=new Scanner(System.in);
        a= input.nextInt();
        b= input.nextInt();
        c= input.nextInt();

        System.out.println();

        System.out.println("First value: "+a+", Last value: "+c);

    }
}

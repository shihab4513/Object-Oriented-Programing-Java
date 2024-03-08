package Area;
import java.util.Scanner;
public class Main
{
   public static void main(String[] args)
   {
       Scanner input=new Scanner(System.in);
       int length,width;
       System.out.println("Enter length: ");
       length=input.nextInt();
       System.out.println("Enter width: ");
       width=input.nextInt();
       area a=new area(length,width);
       a.formula();
       System.out.println(a.returnArea());

   }
}

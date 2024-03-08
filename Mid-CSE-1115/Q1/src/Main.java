import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       int length,width;
        System.out.println("Enter length: ");
        length= input.nextInt();
        System.out.println("Enter width: ");
        width= input.nextInt();
       Area a=new Area(length,width);
       a.printStatement();
       int area=a.returnArea();
        System.out.println("The area is: "+area);



    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double length,width;
        System.out.println("Enter the length of the Rectangle: ");
        length= input.nextDouble();
        System.out.println("Enter the width of the Rectangle: ");
        width= input.nextDouble();
        Rectangle a=new Rectangle(length,width);

        double Area=a.calculateArea();
        System.out.println("Area of the Rectangle is: "+Area);
        double Perimeter=a.calculatePerimeter();
        System.out.println("Perimeter of the Rectangle is: "+Perimeter);

    }
}

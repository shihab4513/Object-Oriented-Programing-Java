

import java.util.Scanner;
public class Vehicle {
    public static void main(String[] args) {
        double distance,fuel_consumption;
        Scanner input=new Scanner(System.in);

        System.out.println("Enter distance:");
        distance= input.nextDouble();
        System.out.println("Enter fuel consumption:");
        fuel_consumption= input.nextDouble();
        System.out.println("Pleas enter a choice:1.Milage of car\n2.Cost of fuel");
        int n;
        Car a=new Car(distance,fuel_consumption);

        n= input.nextInt();
        if (n==1){
            a.getMilage();

        } else if (n==2) {
            a.getCost();

        }
    }
}
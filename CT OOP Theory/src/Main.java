import objects.Car;
import objects.Bus;
import objects.DoubleDecker;
public class Main {
    public static void main(String[] args) {
        Car a=new Car("Toyota","Axio",2015);
        Car b=new Car("Toyota",2014);
        Bus c=new Bus("Tata","Anupoma",2017,"Single");
        Car d=new Bus("Audi","R8",2015,"Single");
        DoubleDecker e=new DoubleDecker("Audi","R8",2015,"Double",2);
        System.out.println(b.model);
        a.setBrand("Audi");
        System.out.println(a.getBrand());
        b.model="Cripper";
        System.out.println(b.model);
        a.Honk();
        b.Honk();
        c.Honk();
    }
}
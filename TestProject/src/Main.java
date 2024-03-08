import java.util.*;

import objects.Bus;
import objects.Car;

public class Main {
    public static void main(String[] args) {
        Car a = new Car("Toyota","Axio", 2015);
        Bus b = new Bus("Tata", "Anupoma",2017);

        Bus c = new Bus (b);
//        System.out.println(b.model);
        b.model = "Cripper";
//        System.out.println(b.model);

        a.Honk();
        b.Honk();
        c.Honk();
    }
}
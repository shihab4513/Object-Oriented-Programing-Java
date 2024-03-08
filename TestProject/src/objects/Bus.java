package objects;

public class Bus extends Car{
    public Bus(String name, String model, int year){
        super(name, model, year);
    }

    public Bus (Bus a){
        this(a.brand,a.model,a.year);
    }
    @Override
    public void Honk() {
        Details();
        System.out.println("Hello I am Bus inherited from Car");
    }
}

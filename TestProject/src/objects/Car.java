package objects;

public class Car {
    public String brand;
    public String model;
    public int year;

    public Car (String name, String model, int year){
        this.brand = name;
        this.model = model;
        this.year = year;
    }

    protected void Details(){
        System.out.printf("%s %s %d\n",brand,model,year);
    }
    public void Honk(){
        Details();
        System.out.println("Hello I am a Car");
    }

}

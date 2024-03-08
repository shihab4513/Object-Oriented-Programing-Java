package objects;

public class Car {
    String brand;
    public String model;
    public int year;
    public Car(String brand,String model,int year)
    {
        this.model=model;
        this.brand=brand;
        this.year=year;
    }
    public Car(String brand,int year)
    {
        this.brand=brand;
        this.year=year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    protected void Details()
    {
        System.out.println(brand+" "+model+" "+year);
    }
    public void Honk()
    {
        Details();
        System.out.println("Hello I am a Car");
    }
}

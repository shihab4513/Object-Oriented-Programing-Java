package objects;

public class Bus extends Car{
    String busType;
    public Bus(String brand,String model,int year,String busType)
    {
        super(brand,model,year);
        this.busType=busType;
    }
    //

    @Override
    protected void Details() {
        super.Details();
        System.out.println(busType);
    }

    @Override
    public void Honk() {
        super.Honk();
        System.out.println("Hello I ama bus ,My Details as follows");
        Details();
    }
}

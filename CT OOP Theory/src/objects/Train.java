package objects;

public class Train extends Car{
    int compartment;
    public Train(String brand,String model,int year,int compartment)
    {
        super(brand,model,year);
        this.compartment=compartment;
    }

    @Override
    protected void Details() {
        super.Details();
        System.out.println(compartment);
    }
}

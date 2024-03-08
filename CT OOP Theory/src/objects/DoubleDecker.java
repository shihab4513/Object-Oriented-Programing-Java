package objects;

public class DoubleDecker extends Bus{
    int numOfWashroom;
    public DoubleDecker(String brand,String model,int year,String busType,int numOfWashroom)
    {
        super(brand,model,year,busType);
        this.numOfWashroom=numOfWashroom;

    }

    @Override
    protected void Details() {
        super.Details();
        System.out.println(numOfWashroom);
    }
}

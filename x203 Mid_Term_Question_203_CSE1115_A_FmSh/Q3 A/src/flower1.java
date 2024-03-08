public class flower1 extends Flower {
    private String flowerName;
    public flower1(int nPetals,String color,String flowerName)
    {
        super(nPetals,color);
        this.flowerName=flowerName;

    }
    public void setFlowerName(String flowerName){
        this.flowerName=flowerName;
    }
    public String getFlowerName()
    {
        return flowerName;
    }

   public void printName()
    {
        System.out.println(getFlowerName());

    }
    public  void printFlower(flower1 x)
    {
        x.printName();
    }
}

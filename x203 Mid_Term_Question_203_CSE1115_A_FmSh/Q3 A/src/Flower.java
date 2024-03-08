public class Flower {
    private int nPetals;
    private String color;
    public Flower(int nPetals,String color)
    {
        this.nPetals=nPetals;
        this.color=color;
    }
    public void printName()
    {
        System.out.println("Flower");
    }
    void printFlower(Flower x)
    {
        x.printName();
    }
}

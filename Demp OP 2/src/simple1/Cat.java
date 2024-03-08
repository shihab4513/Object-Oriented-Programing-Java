package simple1;

public class Cat extends Dog {
    String perception;
    public Cat(String name, String colour, String owner, int age,String perception) {
        super(name, colour, owner, age);
        this.perception=perception;
    }

    @Override
    void print() {
        super.print();
        System.out.print(" "+perception+"\n");
    }
}

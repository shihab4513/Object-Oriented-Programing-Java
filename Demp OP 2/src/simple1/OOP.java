package simple1;

import simple1.animal;

public class OOP {
    public static void main(String[] args)
    {
        animal m=new animal("Shefard","White","Shihab");
        Dog n=new Dog("Billo","Red","Raihan",10);
        Cat p=new Cat("Shiny","Milk white","Zidni",12,"Cute");


        m.print();
        n.print();
        p.print();
    }

}
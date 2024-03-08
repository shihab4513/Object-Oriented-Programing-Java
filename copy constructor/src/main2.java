import java.util.*;
public class main2 {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        person a=new person();
        a.name= input.next();
        a.city= input.next();
        a.age= input.nextInt();
        person b;
        b = new person(a);
        // b=a;
        b.name= input.next();
        b.age= input.nextInt();
        a.display();
        b.display();
    }
}

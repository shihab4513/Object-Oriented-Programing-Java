package Iter;
import java.util.*;
import Iter.data;

public class Main {
    public static void main(String[] args){
        List<data> x=new ArrayList<data>();
        Scanner input1=new Scanner(System.in);
        Scanner input2=new Scanner(System.in);
        String name;
        int height,serial;
        System.out.println("Enter serial no: ");
        serial=input2.nextInt();
        System.out.println("Enter Name: ");
        name=input1.nextLine();
        System.out.println("Enter height: ");
        height=input2.nextInt();
        x.add(new data(serial,name,height));
        Iterator<data> y=x.iterator();

        while (y.hasNext())
        {
            y=x.iterator();
            data z=y.next();
            System.out.println(z);
        }





    }
}

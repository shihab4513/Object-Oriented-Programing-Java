import java.util.*;
public class Main {
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
        Member a=new Member();
        Employee b=new Employee();
        System.out.println("Enter name: ");
        a.setName(input.nextLine());
        System.out.println("Enter age: ");
        a.setAge(input.nextInt());
        System.out.println("Enter number: ");
        a.setNumber(input.next());
        System.out.println("Enter salary: ");
        a.setSalary(input.nextDouble());
        System.out.println("Enter experience: ");
        a.setExperience(input.nextDouble());
        b.changeDesignation();
        System.out.println("\n\n\n\n\n");
        System.out.println(a.getName());
        System.out.println(b.getAge());
        System.out.println(b.getNumber());
        System.out.println(b.getSalary());
       System.out.println(b.designation);
        System.out.println(b.getExperience());


    }
}
package student;

import java.util.*;
public class test {
    public static void main(String[] args)
    {
       int id;
       String name;
       double cgpa;

        Scanner input1=new Scanner(System.in);
        Scanner input2=new Scanner(System.in);
        id=input1.nextInt();
        name=input2.nextLine();
        cgpa=input1.nextDouble();
        Student s=new Student(id,name,cgpa);
        Student s1=new Student(0112210,"Tazvir");
        Student s2=new Student(011221020,"Raihan",4.0);



        s.display();
        System.out.println();
        s1.display();
        System.out.println();
        s2.display();
    }
}

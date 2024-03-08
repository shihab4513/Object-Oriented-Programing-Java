package student;

public class Student {
    int id;
    String name;
    double cgpa;
   Student(int i,String n,double c){
       id=i;
       name=n;
       cgpa=c;

   }
   Student(int i,String n)
   {
       id=i;
       name=n;
   }
    public void display()
    {
        System.out.println(id);
        System.out.println(name);
        System.out.println(cgpa);
    }
}

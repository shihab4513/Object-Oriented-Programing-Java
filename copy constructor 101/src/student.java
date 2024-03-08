public class student {
    int roll;
    String name;
    float mark;
   public student(int r,String n,float m)
   {
       roll=r;
       name=n;
       mark=m;
   }
   student(student s5)
   {
       roll=s5.roll;
       name=s5.name;
       mark=s5.mark;
   }
   void display()
   {
       System.out.println("Roll is: "+roll);
       System.out.println("Name is: "+name);
       System.out.println("Mark is: "+mark);
   }

}

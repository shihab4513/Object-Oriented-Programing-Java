public class Employee extends Member{
    String designation;
   public Employee()
   {

   }
   public Employee(String name,int age,String number,double salary,double experience,String designation)
    {
        super(name,age,number,salary,experience);
        this.designation=designation;
    }
    public void changeDesignation()
    {
        if (getExperience() >= 5) {
            designation=("Experienced!");
        }
        else
        {
            System.out.println("Designation change is not possible.");
        }
    }




}

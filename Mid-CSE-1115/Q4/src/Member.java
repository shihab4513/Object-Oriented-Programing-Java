public class Member {
    private String name,number;
    private int age;
    private double salary,experience;
   //public Member(String name,int age,String number,double salary,double experience){
   //    this.name=name;
   //    this.age=age;
   //    this.number=number;
   //    this.salary=salary;
   //    this.experience=experience;

    //}
    public Member() {

    }

    public Member(String name, int age, String number, double salary, double experience) {
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public int getAge()
    {
        return age;
    }
    public void setNumber(String number)
    {
        this.number=number;
    }
    public String getNumber()
    {
        return number;
    }
    public void setSalary(double salary)
    {
        this.salary=salary;
    }
    public double getSalary()
    {
        return salary;
    }
    public void setExperience(double experience)
    {
        this.experience=experience;
    }
    public double getExperience()
    {
        return experience;
    }

}

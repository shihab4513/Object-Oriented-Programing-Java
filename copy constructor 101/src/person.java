public class person {
    String name,city;
    int age;
   public person(String name,String city,int age) {
       this.name = name;
       this.city = city;
       this.age = age;
   }

    public person(person a) {
        this(a.name,a.city,a.age);
    }

    public person() {

    }

    void display(){
        System.out.println(name+" "+city+" "+age);
    }
}

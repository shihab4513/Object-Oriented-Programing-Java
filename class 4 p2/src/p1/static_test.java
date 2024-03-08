package p1;

public class static_test {
    static void display(){
        System.out.println("Non static method");
    }
    public static void main(String[]  args){
        display();
        static_variable sv1=new static_variable();
        static_variable.display();
       // sv1.display();
        static_variable sv2=new static_variable();
        //sv2.display();
        static_variable.display();
        static_variable sv3=new static_variable();
        //sv3.display();
        static_variable.display();
    }
}

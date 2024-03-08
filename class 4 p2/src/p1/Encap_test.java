package p1;

public class Encap_test {
    public static void main(String[] args){
        student a=new student();
        a.setId(5);
        a.getId();
        System.out.println(a.getId());
        a.setId(5698);
        System.out.println(a.getId());

    }
}

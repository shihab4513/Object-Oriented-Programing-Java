public class Main {
    public static void main(String[] args) {

        student s1=new student(101,"Tonny",65.23f);
        System.out.println("Record of s1: ");
        s1.display();
        student s2=new student(s1);
        System.out.println("Record of s2: ");
        s2.display();
        System.out.println("Both are same.");
    }
}
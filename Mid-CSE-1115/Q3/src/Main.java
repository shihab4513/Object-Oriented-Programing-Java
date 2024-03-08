public class Main {
    public static void main(String[] args) {

        MTest testObj=new MTest();
        Exam e1=new Exam();
        Exam e2=new Exam();
        e1.id=10; e1.mark=70;
        e2.id=20; e2.mark=85;                                           //Hoi nai,  X
        System.out.println(e1.id+" "+e1.mark);
        testObj.testFnc1(e1,e2);
        System.out.println(e1.id+" "+e1.mark);
        testObj.testFnc2(e1,e2);
        System.out.println(e1.id+" "+e1.mark);
        e1=new Exam();
        e2=new Exam();

    }
}
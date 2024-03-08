public class MTest {
    void testFnc1(Exam m1,Exam m2)
    {
        Exam temp=m1;
        m1=m2;
        m2=temp;
    }
    void testFnc2(Exam m1,Exam m2)
    {
        int tempId=m1.id;
        double tempMark=m2.mark;
        m1.id=m2.id; m1.mark=m2.mark;
        m2.id=tempId; m2.mark=tempMark;
    }
}

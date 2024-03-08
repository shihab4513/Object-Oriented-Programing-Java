public class Base {
    public int a;
    private double b;
    Base(int a,double b)
    {
        this.a=a;
        this.b=b;
    }
    Base(Base ob){
        a=ob.a;
        b=ob.b;
    }
    //code for a
    public void setB(double b)
    {
        this.b=b;
    }
    public double getB()
    {
        return b;
    }

}

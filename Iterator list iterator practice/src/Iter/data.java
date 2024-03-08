package Iter;

public class data {
    private String n;
    private int h,s;
    public data(int serial,String name,int height)
    {
        this.s=serial;
        this.n=name;
        this.h=height;
    }
    public int getSerial()
    {
        return s;
    }
    public String getName(){
        return n;
    }
    public int getHeight()
    {
        return h;
    }
    public String toString()
    {
        return (s+" "+n+" "+h);
    }

}

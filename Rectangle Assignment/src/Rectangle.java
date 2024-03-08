
public class Rectangle {
    double length,width;
    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    public double calculateArea()
    {
        return length*width;
    }
    public double calculatePerimeter()
    {
        double p=(2*length)+(2*width);
        return p;
    }



}
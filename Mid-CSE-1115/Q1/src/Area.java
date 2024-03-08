public class Area {
    private int length,width;
    public Area(int length,int width)
    {
        this.length=length;
        this.width=width;
    }
     public int returnArea()
    {
        return length*width;
    }
    public void printStatement()
    {
        System.out.println("The area A of a rectangle is given by the formula, A=lw, where l is the length and w is the width.");
    }

}

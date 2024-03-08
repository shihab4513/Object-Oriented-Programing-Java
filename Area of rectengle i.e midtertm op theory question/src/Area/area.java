package Area;

public class area {
     int length;
     int width;
    public area(int len,int wid){
        this.length=len;
        this.width=wid;
    }

    int returnArea(){

        return length*width;
    }
    public void formula()
    {
        System.out.println("The area A of a rectangle is given by the formula, A=lw, where l is the length and w is the width.");
    }



}

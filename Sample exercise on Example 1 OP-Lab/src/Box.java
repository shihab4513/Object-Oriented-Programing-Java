public class Box {
    public int _length,_width,_height;




    public Box(int length,int width,int height){
        _length=length;
        _width=width;
        _height=height;

    }
    public void getVolume(){
        int r=_length*_width*_height;
        System.out.println(r);
    }

}

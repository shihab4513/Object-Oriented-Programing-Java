package simple1;

public class animal {
    String _name,_colour,_owner;

    public animal(String name,String colour,String owner){
        _name=name;
        _colour=colour;
        _owner=owner;

    }

    void print(){
        System.out.println(_name+" "+_colour+" "+_owner+" ");
    }
}

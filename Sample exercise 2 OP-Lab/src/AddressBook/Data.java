package AddressBook;

public class Data {
     private String name;
     private int id;
    private float cgpa;

    public Data(String Name, int Id, float Cgpa) {
        this.name = Name;
        this.id = Id;
        this.cgpa = Cgpa;
    }
    public String getName() {return name;
    }
public int getId() {return id;
    }
 public float getCgpa() {
    return cgpa;

    }
    public String toString(){
        return name+" "+id+" "+cgpa;
    }
}

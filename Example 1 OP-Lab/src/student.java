public class student {
    // Instance variables
    public String name;
    public String id;
    public float cgpa;
    public int creditCompleted;
    // Constructor – we will discuss later


    public student(String name, String id, float cgpa, int creditCompleted) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
        this.creditCompleted = creditCompleted;
    }

    // Methods
public void updateCgpa(int credit, float gpa){
    cgpa = (cgpa*creditCompleted + credit*gpa)/(creditCompleted+credit);
    creditCompleted = creditCompleted + credit;
}
   // public float getCgpa(){
   //     return cgpa;
   // }
}

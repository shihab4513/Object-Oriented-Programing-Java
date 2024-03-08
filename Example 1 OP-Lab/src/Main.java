public class Main {
    public static void main(String[] args) {
        // Create object
        student studentR = new student("", "",1,10);
        student studentK = new student("","",1,1);
// Assign values to attributes
        studentR.name = "Rashid";
        studentR.cgpa = 3.0f;
        studentR.creditCompleted = 20;
        studentK.name = "Khaled";
        studentK.cgpa = 3.0f;
        studentK.creditCompleted = 20;
// display cgpa before update
        System.out.println(studentR.name + "; Credit Completed: "+ studentR.creditCompleted +"; Previous cgpa: "+ studentR.cgpa);
        System.out.println(studentK.name + "; Credit Completed: "+ studentK.creditCompleted +"; Previous cgpa: "+ studentK.cgpa);
// update cgpa
        studentR.updateCgpa(3, 4.0f);
// display cgpa after update
        System.out.println("After Update");
        System.out.printf("%s; Credit Completed: %d; New cgpa: %.2f\n", studentR.name, studentR.creditCompleted, studentR.cgpa);
        System.out.printf("%s; Credit Completed: %d; New cgpa: %.2f", studentK.name, studentK.creditCompleted, studentK.cgpa);

    }
}
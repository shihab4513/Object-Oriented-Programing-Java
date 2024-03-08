//Write a program (WAP) that will find the grade of N students. For each student, it will take the marks of his/her the attendance (on 5 marks), assignment (on 10 marks), class test (on 15 marks), midterm (on 50 marks), term final (on 100 marks). Then based on the tables shown below, the program will output his grade.
import java.util.Scanner;
public class SL9 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        float a,hw,ct,mt,tf,sum=0;
        int n=input.nextInt();
        for (int i = 1; i <= n; i++) {
            a= input.nextFloat();
            hw= input.nextFloat();
            ct= input.nextFloat();
            mt= input.nextFloat();
            tf= input.nextFloat();
            mt=(100*mt)/50;
            mt=(mt*30)/100;
            tf=(tf*40)/100;
            sum=a+hw+ct+mt+tf;
            if (sum>=90&&sum<=100)
            {
                System.out.println("Student "+i+" : A");
            } else if (sum>=86&&sum<=89) {
                System.out.println("Student "+i+" : A-");
            }
         else if (sum>=82&&sum<=85) {
            System.out.println("Student "+i+" : B+");
        }
            else if (sum>=78&&sum<=81) {
                System.out.println("Student "+i+" : B");
            }
            else if (sum>=74&&sum<=77) {
                System.out.println("Student "+i+" : B-");
            }
            else if (sum>=70&&sum<=73) {
                System.out.println("Student "+i+" : C+");
            }
            else if (sum>=66&&sum<=69) {
                System.out.println("Student "+i+" : C");
            }
            else if (sum>=62&&sum<=65) {
                System.out.println("Student "+i+" : C-");
            }
            else if (sum>=58&&sum<=61) {
                System.out.println("Student "+i+" : D+");
            }
            else if (sum>=55&&sum<=57) {
                System.out.println("Student "+i+" : D");
            }
            else if(sum<55){
                System.out.println("Student "+i+" : F");
            }
            else {
                System.out.println("You might be added wrong marks.Pleas check and try again later.");
            }

        }

    }
}
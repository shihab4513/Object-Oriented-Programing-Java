package data;

import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        student a=new student();
      // a.setName("Shihab Uddin");

      // a.setId("011221017");
      // a.setCgpa( 3.26f);

            a.setName(input.nextLine());

            a.setId(input.nextLine());
             a.setCgpa(input.nextFloat());



            System.out.println(a.getName());
            System.out.println(a.getId());
            System.out.println(a.getCgpa());


    }
}

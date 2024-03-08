package AddressBook;
import AddressBook.Data;
//import java.util.Scanner;
import javax.lang.model.element.Name;
import java.util.*;
public class Main {

   public static void main(String[] args){
       Scanner s1=new Scanner(System.in);
       Scanner s2=new Scanner(System.in);
       int ch;
       List<Data> a=new ArrayList<Data>();
       do {
           System.out.println("1.Insert");
           System.out.println("2.Display");
           System.out.println("3.Search");
           System.out.println("4.Delete");
           System.out.println("5.Update");
           System.out.println("Enter your choice: ");
           ch=s2.nextInt();
           switch (ch){
               case 1:
                   System.out.println("Enter Student name: ");
                   String stuName=s1.nextLine();
                   System.out.println("Enter your Id: ");
                   int stuId=s2.nextInt();
                   System.out.println("Enter your Cgpa: ");
                   float stuCgpa=s2.nextFloat();
                   a.add(new Data(stuName,stuId,stuCgpa));
                   break;
               case 2:
                   System.out.println("-------------------------------");
                   Iterator<Data> e = a.iterator();
                   while (e.hasNext()){
                       Data b=e.next();
                       System.out.println(b);
                       System.out.println("-----------------------------------");
                   }
                   break;
               case 3:
                   boolean found=false;
                   System.out.println("Enter student Id you want to search: ");
                   int StudentId=s2.nextInt();
                   //System.out.println("------------------------------------");
                   e=a.iterator();
                   while (e.hasNext()){
                       Data b =e.next();
                       if (b.getId()==StudentId){

                           System.out.println(b);
                           found=true;
                       }
                   }
                   System.out.println("------------------------");
                   if (!found){
                       System.out.println("Record not found!");
                   }
                   System.out.println("--------------------------");
                    break;

               case 4:
                    found=false;
                   System.out.println("Enter Id   number of the student  to delete : ");
                    StudentId=s2.nextInt();
                   //System.out.println("------------------------------------");
                   e=a.iterator();
                   while (e.hasNext()){
                       Data b =e.next();
                       if (b.getId()==StudentId){

                          e.remove();
                           found=true;
                       }
                   }
                   System.out.println("------------------------");
                   if (!found){
                       System.out.println("Record not found!");
                   }
                   else {
                       System.out.println("Record is deleted successfully!");
                   }
                   System.out.println("--------------------------");
                   break;
               case 5:
                   found=false;
                   System.out.println("Enter Id   number of the student to update : ");
                   StudentId=s2.nextInt();
                   //System.out.println("------------------------------------");
                   ListIterator<Data>li=a.listIterator();
                   while (li.hasNext()){
                       Data b =li.next();
                       if (b.getId()==StudentId){

                           System.out.println("Enter the new name: ");
                           stuName=s1.nextLine();
                           System.out.println("Enter new Id: ");
                           stuId=s2.nextInt();
                           System.out.println("Enter the new Cgpa: ");
                           stuCgpa=s2.nextFloat();
                           li.set(new Data(stuName,stuId,stuCgpa));
                           found=true;
                       }
                   }
                   System.out.println("------------------------");
                   if (!found){
                       System.out.println("Record not found!");
                   }
                   else {
                       System.out.println("Record is updated successfully!");
                   }
                   System.out.println("--------------------------");
                   break;



           }
       }while (ch!=0);
   }
}

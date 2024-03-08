//1.  Write a java program to print the nth digit of a number where n is a positive number.
package Assignment;



import java.util.Scanner;
public class a1{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n1,n2,i,count=0,rem=0;
        System.out.println("Enter a number: ");
        n1=in.nextInt();
        int x=n1;
        if(n1>0){
            System.out.println("Enter the digit you want to find: ");
            n2=in.nextInt();
            for(i=n1;i>0;i=i/10)
            {
                count++;
            }
            int r=count-n2+1;
            for(i=0;i<r;i++)
            {
                rem=n1%10;
                n1=n1/10;
            }
            System.out.println("Number "+n2+" Digit of "+x+" number is:"+rem);
        }

    }
}
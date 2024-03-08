//3.   Write a java program that will count occurrence of a given number in an array
package Assignment;

import java.util.Scanner;
public class a3{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n,i,count=0,x;
        int[] a=new int[100];
        System.out.println("Enter number of element you want to store in this array: ");
        n=in.nextInt();
        System.out.println("Enter the number: ");
        for(i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.println("Enter the number which you want to find occurrence of:");
        x=in.nextInt();
        for(i=0;i<n;i++)
        {
            if(x==a[i])
            {
                count++;
            }
        }
        System.out.println(x+" Occurred:"+count+" times.");

    }
}

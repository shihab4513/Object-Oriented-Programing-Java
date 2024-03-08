//Write a program (WAP) that will take N numbers as inputs and compute their average.
//(Restriction: Without using any array)
import java.util.Scanner;
public class SL4 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n;
        float x,sum=0,average;
        System.out.println("Enter input: ");
        n=input.nextInt();
        for (int i = 0; i <n ;i++) {
            x=input.nextFloat();
            sum=sum+x;
        }
        average=sum/n;
        System.out.print("Average of "+n+" input is: "+average);


    }

}

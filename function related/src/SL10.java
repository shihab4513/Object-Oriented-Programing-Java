import java.util.Scanner;
public class SL10 {
    static void swap(int a,int b){
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("Value in func: "+a+" "+b);
    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n1,n2;
        n1=input.nextInt();
        n2= input.nextInt();
        swap(n1,n2);
        System.out.println("Value in main: "+n1+" "+n2);
    }
}

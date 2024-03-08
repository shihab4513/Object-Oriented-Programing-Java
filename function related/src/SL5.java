import java.util.Scanner;
public class SL5 {
    static void CompareNumber(int a,int b)
    {
        if (a>b){
            System.out.println(a+" is greater than "+b);
        } else if (a< b) {
            System.out.println(a+" is less than "+b);

        }
        else {
            System.out.println(a+" is equal to "+b);
        }
    }


    public static void main(String[] args)
    {
       Scanner input=new Scanner(System.in);
       int n1,n2;
       n1= input.nextInt();
       n2= input.nextInt();
       CompareNumber(n1,n2);

    }

}

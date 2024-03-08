import java.util.*;
public class SL11 {

    static void printEvenNumber(int[] x,int n){
        for (int i = 0; i <n ; i++) {
               if (x[i]%2==0){
                   System.out.print(x[i]+" ");
               }
        }
    }

    public static void main(String[] args){
       Scanner input=new Scanner(System.in);
       int[] a=new int[100];
       int n;
       n= input.nextInt();
        for (int i = 0; i <n ; i++) {
            a[i]= input.nextInt();
        }
        printEvenNumber(a,n);
    }
}

import java.util.Scanner;
public class SL9 {
static int power(int a,int b){
    int product=1;
    for (int i = 0; i <b ; i++) {
        product=product*a;
    }
    return product;
}


    public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    int n1,n2,r;
    n1= input.nextInt();
    n2= input.nextInt();
    r=power(n1,n2);
        System.out.println(n1+" to the power "+n2+" is : "+r);

    }
}

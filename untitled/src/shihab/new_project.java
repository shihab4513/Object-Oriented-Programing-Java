package shihab;
import java.util.Scanner;



public class new_project {
   public static void main(String[] args)
   {
      int n;
      double d;
      String s;
      Scanner in=new Scanner (System.in);
      n=in.nextInt();
      d=in.nextDouble();
      s=in.next();
       for(int i=1;i<=n;i++)
       {
          if (i%2==0)
          {
              System.out.println(+i);

          }
       }
       System.out.println(+d);
       System.out.println(s);

   }
}

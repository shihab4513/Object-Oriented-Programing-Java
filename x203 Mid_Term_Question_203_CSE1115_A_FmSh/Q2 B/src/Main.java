public class Main {
    public static void main(String[] args) {

        double[] a=new double[8];
        double sum=0;
        a[0]=1.0;
        a[1]=10.0;
        a[2]=3.5;
        a[3]=8.9;
        a[4]=7.9;
        a[5]=3.9;
        a[6]=4.0;
        a[7]=101.3;
        a[8]=0.0;
        for (double x:a) {
            if (x<10.0)
            {
                sum = sum + x;
            }

           }
        int size=0;
        for (double x:a){
            size++;
        }
        System.out.println("Size: "+size);

    }
    }


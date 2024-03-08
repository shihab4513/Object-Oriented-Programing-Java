public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        int[] a;


        a = new int[]{2, 3, 9, 8, 13, 1, 5, 19, 15, 0, 4};


        int max = a[0], min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (max == a[i]) {
                System.out.println("Max is: " + a[i]);
            } else if (min == a[i]) {
                System.out.println("Min is: " + a[i]);
            }
        }


    }
}
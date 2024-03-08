import java.util.*;
public class ArrayApplication {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[][] arr=new int[2][3];
        System.out.println("Enter your array: ");
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                arr[i][j]= input.nextInt();
            }

        }
        System.out.println("Your array is: ");
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
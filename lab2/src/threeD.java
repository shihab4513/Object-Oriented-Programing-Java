import java.util.*;
public class threeD {

        public static void main (String[]args){
     int [][][] array3={
             {
                     {10,20,99},
                     {30,40,88}
             },
             {
                     {100,200,300},
                     {400,500,600}
             },
     };
            for (int i = 0; i < array3.length ; i++) {
                for (int j = 0; j <array3[i].length ; j++) {
                    for (int k = 0; k <array3[i][j].length ; k++) {
                        System.out.print(array3[i][j][k]+" ");
                    }
                    System.out.println("");
                }
                System.out.println("************************");
            }
    }
    }

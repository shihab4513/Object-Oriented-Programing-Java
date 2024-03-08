package array;


import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<Integer>();
        // to add
        li.add(1);
        li.add(5);
        li.add(0);
        li.add(10);
        System.out.println(li);
        // to get specific number
        int element = li.get(0);
        System.out.println(element);
        // to modify array
        li.add(0, 100);
        System.out.println(li);
        // to delete
        li.remove(1);
        System.out.println(li);
        // set element
        li.set(2, 200);
        System.out.println(li);
        // to know the size of array
        int size = li.size();
        System.out.println(size);
        // loops
        for (int i = 0; i < li.size(); i++) {
            System.out.print(li.get(i) + " ");
        }
         System.out.println();
        // for sorting
        Collections.sort(li);
        System.out.println(li);

    }

}

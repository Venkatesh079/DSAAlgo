package collections;

import java.util.*;

public class ArrayListBasic {

    public static void main(String[] args) {
        printArrayList();

    }

   // Write a program to create an ArrayList of integers and add the numbers 1 to 10. Print the list.

    private static ArrayList<Integer> createArrayList() {
        ArrayList<Integer> list = new ArrayList<>();
       for (int i = 0; i < 10; i++) {
           list.add(i);
       }
       return list;
    }

    // Remove the number at index 5 from the list and print the list again.
    private static void printArrayList() {
        ArrayList<Integer> list = createArrayList();
        list.remove(5);
        System.out.println(list);

        boolean contains = list.contains(90);
        System.out.println(contains);
    }
}

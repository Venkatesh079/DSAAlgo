package collections;

import java.util.*;
import java.util.stream.*;

/**
 * List Sorting:
 * Create a List of String containing names of at least five different fruits.
 * Sort the list alphabetically and print the sorted list.
 * Sort the list by the length of the fruit names and print the sorted list.
 */
public class ListSorting {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Grapes");
        fruits.add("Pineapple");
        fruits.add("Mango");
        fruits.add("Pear");
        System.out.println(sortAlphabetically(fruits));

        sortByLength(fruits);
        System.out.println(fruits);


    }

    private static List<String> sortAlphabetically(List<String> fruits) {
        return fruits.stream().sorted().collect(Collectors.toList());
    }

    private static void sortByLength(List<String> fruits) {
         fruits.sort(Comparator.comparingInt(String::length));
    }
}

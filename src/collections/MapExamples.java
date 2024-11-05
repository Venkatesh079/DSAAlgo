package collections;

import java.util.*;

/**
 * Create a HashMap that maps strings to integers.
 * Add the following entries: ("one", 1), ("two", 2), ("three", 3).
 * Retrieve and print the value associated with the key "two".
 * Remove the entry for "one" and print the updated map.
 */
public class MapExamples {

    public static void main(String[] args) {

        HashMap<String, Integer> map = createHashMap();

        System.out.println(map);
        System.out.println(" associated with the key two : "+ map.get("two"));
        map.remove("one");
        System.out.println(map);

    }

    private static HashMap<String, Integer> createHashMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        return map;
    }

}

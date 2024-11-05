package collections;

import java.util.*;

public class HashSetsExamples {

    public static void main(String... args) {
        System.out.println("HashSets Example");
        System.out.println(createHashSet());


    }

    public static Set<String> createHashSet() {
        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("cherry");
        set.add("elderberry");
        set.add("date");

            boolean valid = set.contains("banana");
            System.out.println(valid);

        return set;
    }

//    public static
}

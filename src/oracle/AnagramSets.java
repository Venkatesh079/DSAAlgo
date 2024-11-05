package oracle;

import java.util.*;

public class AnagramSets {

    // Function to group anagrams from a list of words
//    public static List<List<String>> groupAnagrams(String[] words) {
//        if (words == null || words.length == 0) {
//            return new ArrayList<>();
//        }
//
//        Map<String, List<String>> map = new HashMap<>();
//        for (String word : words) {
//            // Convert the word to a char array, sort it, and then convert it back to a string
//            char[] charArray = word.toCharArray();
//            Arrays.sort(charArray);
//            String sortedWord = new String(charArray);
//
//            // If the sorted word is not already a key in the map, add it
//            if (!map.containsKey(sortedWord)) {
//                map.put(sortedWord, new ArrayList<>());
//            }
//            // Add the original word to the list associated with the sorted key
//            map.get(sortedWord).add(word);
//        }
//
//        // Convert map values to a list of lists
//        return new ArrayList<>(map.values());
//    }
//
//    public static void main(String[] args) {
//        String[] words = {"listen", "silent", "enlist", "inlets", "google", "gogole", "cat", "tac", "act"};
//
//        List<List<String>> anagramGroups = groupAnagrams(words);
//
//        // Print the sets of anagrams
//        for (List<String> group : anagramGroups) {
//            System.out.println(group);
//        }
//    }

    public static void main(String[] args) {
        String word = "CAT";
        Set<String> anagrams = new HashSet<>();

        // Generate all anagrams
        generateAnagrams(word, "", anagrams);

        // Print the anagrams
        System.out.println("Anagrams of " + word + ": " + anagrams);
    }
    private static void generateAnagrams(String word, String prefix, Set<String> anagrams) {
        if (word.length() == 0) {
            anagrams.add(prefix);
        } else {
            for (int i = 0; i < word.length(); i++) {
                String remaining = word.substring(0, i);
                generateAnagrams(remaining, prefix + word.charAt(i), anagrams);
            }
        }
    }


}


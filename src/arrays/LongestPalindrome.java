package arrays;



public class LongestPalindrome {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("aaaabbaa"));
    }


    private static String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) return "";

        String longest = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String substring = s.substring(i, j + 1);
                if (isPalindrome(substring) && substring.length() > longest.length()) {
                    longest = substring;
                }
            }
        }
        return longest;
    }

    private static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

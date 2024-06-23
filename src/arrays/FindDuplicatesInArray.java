package arrays;

import java.util.*;

public class FindDuplicatesInArray {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1,9,0,9,8,67,98 };

        System.out.println(secondLarge(arr));
    }

    public static int secondLarge(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            }

            else if (arr[i] > second && arr[i] != first)
            {
                second = arr[i];
            }
        }
        return first;
    }
}

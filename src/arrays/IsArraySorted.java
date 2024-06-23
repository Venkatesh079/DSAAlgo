package arrays;

import java.util.*;

public class IsArraySorted {
    public static void main(String[] args) {
        int[] arr = { 5,8, 4, 3, 2, 1 };

        System.out.println(isArraySorted2(arr));

    }
    //Brute
    public static boolean isArraySorted(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isArraySorted2(int[] arr) {
        for (int i = 1; i < arr.length-1; i++) {
            if (arr[i] > arr[i-1]) {
                return false;
            }
        }
        return true;
    }
}

package arrays;

import java.util.ArrayList;
import java.util.List;

public class UnionOfSortedArrays {

    public static List<Integer> unionSortedArrays(int[] arr1, int[] arr2) {
        List<Integer> unionArray = new ArrayList<>();
        int i = 0, j = 0;

        // Traverse both arrays
        while (i < arr1.length && j < arr2.length) {
            // If both elements are equal, add any one of them and move both pointers
            if (arr1[i] == arr2[j]) {
                if (unionArray.isEmpty() || unionArray.get(unionArray.size() - 1) != arr1[i]) {
                    unionArray.add(arr1[i]);
                }
                i++;
                j++;
            }
            // If element in arr1 is smaller, add it and move the pointer in arr1
            else if (arr1[i] < arr2[j]) {
                if (unionArray.isEmpty() || unionArray.get(unionArray.size() - 1) != arr1[i]) {
                    unionArray.add(arr1[i]);
                }
                i++;
            }
            // If element in arr2 is smaller, add it and move the pointer in arr2
            else {
                if (unionArray.isEmpty() || unionArray.get(unionArray.size() - 1) != arr2[j]) {
                    unionArray.add(arr2[j]);
                }
                j++;
            }
        }

        // Add remaining elements of arr1
        while (i < arr1.length) {
            if (unionArray.isEmpty() || unionArray.get(unionArray.size() - 1) != arr1[i]) {
                unionArray.add(arr1[i]);
            }
            i++;
        }

        // Add remaining elements of arr2
        while (j < arr2.length) {
            if (unionArray.isEmpty() || unionArray.get(unionArray.size() - 1) != arr2[j]) {
                unionArray.add(arr2[j]);
            }
            j++;
        }

        return unionArray;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr2 = {2, 3, 5, 7};

        List<Integer> unionArray = unionSortedArrays(arr1, arr2);

        System.out.println("Union of the two sorted arrays: " + unionArray);
    }
}

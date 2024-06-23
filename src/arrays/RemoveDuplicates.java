package arrays;

import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int [] array = {1,1,2,2,3,3,4};

        System.out.println(removeDuplicates2(array));

    }

    //Brute force
    public static int[] removeDuplicates(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i < nums.length; i++) {
            set.add(nums[i]);
        }
        System.out.println(set);
        int k = set.size();
        int[] res = new int[k];
        int index = 0;
        for (int x: set) {
            res[index++] = x;
        }
        return res;
    }

    public static int removeDuplicates2(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; i++) {

            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}

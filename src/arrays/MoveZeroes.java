package arrays;

import java.util.*;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0,0,0,0,0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));

    }

    public static void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) return;
        int j=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}

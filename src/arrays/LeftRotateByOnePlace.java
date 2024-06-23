package arrays;

import java.util.*;

public class LeftRotateByOnePlace {

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8};
        rotate(array);
        System.out.println(Arrays.toString(array));

    }

    public static void rotate(int[] nums) {
        if (nums == null || nums.length == 0) return;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int temp = nums[i];
            nums[i] = nums[n - 1 - i];
            nums[n - 1 - i] = temp;
        }

    }
}

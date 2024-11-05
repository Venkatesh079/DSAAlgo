package arrays;

import java.util.Arrays;

public class FindMissingPositive {

    public static void main(String[] args) {
        int[] arr = { 7,8,9,11,12};
        System.out.println(findMissingPositive(arr));

    }

    private static int findMissingPositive(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int smallestMissingPositive = 1;
        for (int num : nums) {
            if (num == smallestMissingPositive)
            {
                smallestMissingPositive++;
            }
        }
        return smallestMissingPositive;
    }
}

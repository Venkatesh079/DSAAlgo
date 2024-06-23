package arrays;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

public class TwoSum {

    public static void main(String[] args) {
        int[] arr = new int[]{9};
        int[] arrDup = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(mySqrt(8));

    }

    public static int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];

        HashMap<Integer, Integer> targetMap = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(targetMap.containsKey(nums[i]))
            {
                result[0] = targetMap.get(nums[i]);
                result[1] = i;
                break;
            }
            targetMap.put(target-nums[i], i);
        }
        return result;
    }

    public static int removeDuplicates(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }

        int index = 0;

        for(int i=1; i<nums.length; i++)
        {
            if(nums[i] != nums[index])
            {
                nums[++index] = nums[i];
            }
        }
        return index+1;
    }

    /**
     * 66. Plus One
     * @param digits
     * @return
     */
    public static int[] plusOne(int[] digits)
    {
        for (int i = digits.length-1; i>=0; i-- ){
            if (digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }

        digits = new int[digits.length +1];
        digits[0]=1;
        return digits;
    }

    public static int countKeyChanges(String s) {
        int count = 0;
        int n = s.length();

        s = s.toLowerCase();
        for (int j = 1; j < n; j++) {
            String string = s.substring(j - 1, j);

        }
        return count;
    }

    public static List<Integer> findWordsContaining(String[] words, char x) {

        List<Integer> result = new ArrayList<>();
        for (int i=0; i<words.length; i++){
            if (words[i].indexOf(x)!=-1){
                result.add(i);
            }
        }

        return result;
    }
    public static int mySqrt(int x) {
        if (x == 0 || x == 1)
            return x;

        int start = 1;
        int end = x;
        int mid = -1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if ((long) mid * mid > (long) x)
                end = mid - 1;
            else if (mid * mid == x)
                return mid;
            else
                start = mid + 1;
        }
        return Math.round(end);
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();
        if (numRows==1){
            pascalTriangle.add(Collections.singletonList(numRows));
        }
        else if (numRows==2){
           pascalTriangle.addAll(0, pascalTriangle);
        }
        for (int i=0; i<numRows; i++){


        }

        return pascalTriangle;
    }
}

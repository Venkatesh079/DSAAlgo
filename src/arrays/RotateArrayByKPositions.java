package arrays;

public class RotateArrayByKPositions {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 10;
        rotate(arr, k);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void rotate(int[] arr, int k) {

        int n = arr.length;
        k = k % n; //
       revere(arr,0, n-1); //Reverse the entire array.
       revere(arr,0,k-1); // Reverse the first k elements.
       revere(arr,k,n-1); // Reverse the remaining n−k elements.


    }

    private static void revere(int[] arr, int start , int end ) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
}

package arrays;

public class RotateArrayByKTimes {

    public static void main(String[] args) {
        int[] arr = new int[]{1,23,3,5};
        rotate(arr, 2);
    }

    private static void rotate(int arr[], int k){
        int size = arr.length;

        for (int i=k; i<size; i++){
            System.out.println(arr[i]);
        }
    }
}

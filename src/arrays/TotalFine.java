package arrays;

public class TotalFine {

    public static void main(String[] args) {

        int car[] = new int[]{7, 9, 10, 8,11};
        int fine[] = new int[]{250, 500, 350, 200};
        int length =fine.length;
       // System.out.println(totalFine(12,car,fine));

        System.out.println(shortestUnorderedSubarray(car));
    }

    public static long totalFine(int date, int car[], int fine[])
    {
        // code here
        long totalFine = 0;
        for(int i=0; i<car.length; i++)
        {
            if(date%2==0 )
            {
                if (car[i]%2!=0)
                {
                totalFine +=  fine[i];
                }
            }

            else
            {
                totalFine +=  fine[i];
            }

        }
        return totalFine;
    }

    public static int shortestUnorderedSubarray(int arr[]) {

        int count = 0;
        for (int k : arr) {
            int j = 1;
            if (k < arr[j]) {
                count++;

            }
            count = count+1;
        }
        return count;
    }
}

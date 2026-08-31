package Day_2;

public class Sliding_Window {

    //Fixed window size
    static int maxWindowSum(int[] arr,int k) {
        int sum = 0;
        for (int i = 0; i < k; i++)
            sum += arr[i];
        int max = sum;
        for (int i = k; i < arr.length; i++) {
            sum = sum + arr[i] - arr[i - k];
            if (max < sum)
                max = sum;
        }
        return max;
    }

    //Variable size sliding window
    static int minSubArrayLen(int[] arr , int target) {
        int left = 0;
        int sum = 0;
        int minLength=arr.length+1;
        for (int right = 0; right < arr.length; right++) {
            sum+=arr[right];
                 while (sum >= target) {
                     int currentLen=right-left+1;
                     if(currentLen<minLength)
                         minLength=currentLen;
                     sum -= arr[left];
                     left++;
                 }
             }
        if(minLength==(arr.length+1))
            return 0;

        return minLength;
    }
}

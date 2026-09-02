package Day_3;


import static java.lang.Math.max;

public class Kadanes_Algo {

    static int maxSubArraySum(int[] arr){
        int currentSum=arr[0];
        int maxSum=arr[0];
        for(int i=1;i<arr.length;i++){
            int currentElement=arr[i];
//            if(currentElement>(currentSum+currentElement))
//                currentSum=currentElement;
//            else
//                currentSum+=currentElement;
//            if(currentSum>maxSum)
//                maxSum=currentSum;
            currentSum=max(currentElement , (currentSum+currentElement));
            maxSum=max(maxSum,currentSum);
        }
        return maxSum;
    }

    static void main() {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        int[] arr1={-5,-2,-8,-1};
        System.out.println("Maximum sum: "+maxSubArraySum(arr));
        System.out.println("Maximum sum of arr1: "+maxSubArraySum(arr1));

    }
}

package Day_1;

public class Prefix_Sum {
    static int[] createPrefixSum(int[] arr){
        int[] prefix=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        return prefix;
    }

    static int rangeSum(int[] prefix,int L , int R){
        if(L==0)
            return prefix[R];
        else
            return prefix[R]-prefix[L-1];
    }

    static int pivotIndex(int[] prefix,int[] arr){
        int pivot=-1;
        int totalSum=rangeSum(prefix,0, prefix.length-1);
        for(int i=0;i<prefix.length;i++){
            int leftSum=prefix[i]-arr[i];
            int rightSum=totalSum-leftSum-arr[i];
            if(leftSum==rightSum){
                pivot=i;
                break;
            }
        }
        return pivot;

    }

    static void main() {
        int[] arr={1,7,3,6,5,6};
        int[] prefix=createPrefixSum(arr);
        System.out.print("Prefix sum array is : ");
        for(int i=0;i<prefix.length;i++) {
            System.out.print(prefix[i] + "\t");
        }
        System.out.println();
//        System.out.println(rangeSum(prefix,1,3));
//        System.out.println(rangeSum(prefix,0,4));
//        System.out.println(rangeSum(prefix,2,4));
        int pivot_Index=pivotIndex(prefix,arr);
        System.out.println("Pivot element of the given array is : "+ arr[pivot_Index]);
    }
}

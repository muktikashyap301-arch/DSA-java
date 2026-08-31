package Day_1;

import java.util.Scanner;

public class Pivot_Element {
      static int pivotIndex(int[] arr){
          int totalSum=0;
          for(int num :arr){
              totalSum+= num;
          }
          int leftSum=0;
          for(int i=0;i<arr.length;i++){
              int rightSum=totalSum-arr[i]-leftSum;
              if(leftSum==rightSum)
                  return i;
              leftSum+=arr[i];
          }
          return -1;
      }

    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array : ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter elements of an array : ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        int pivot_index=pivotIndex(arr);
        System.out.println("Pivot index is : "+pivot_index);
        System.out.println("Pivot element of the given array is : "+ arr[pivot_index]);

    }
}

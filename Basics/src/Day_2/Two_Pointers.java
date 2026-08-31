package Day_2;

import java.util.Scanner;

public class Two_Pointers {
    static int size;
    static int[] arr;
    static Scanner sc=new Scanner(System.in);
    static int[] twoSum(int[] arr,int target ){
        int left=0;
        int right=(arr.length)-1;
        int[] indices= {-1,-1};
        while(left<right){
            int sum =arr[left]+arr[right];
            if(sum==target) {
                indices[0]=left;
                indices[1]=right;
                return indices;
            }
            else if (sum<target)
                left++;
            else
                right--;
        }
        return indices;
    }

    static void display(){
        System.out.println("Enter the target: ");
        int target=sc.nextInt();
        int[] indices=twoSum(arr,target);
        System.out.println("[ "+indices[0] +" , " +indices[1]+ " ]");

    }

    static void main() {

        System.out.println("Enter size of an array : ");
        size=sc.nextInt();
        System.out.println("Enter elements of an array : ");
        arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        display();
        display();
    }
}

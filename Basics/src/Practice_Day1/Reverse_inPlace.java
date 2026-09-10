package Practice_Day1;

public class Reverse_inPlace {
    static void reverse(int [] arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        for(int num:arr)
        System.out.print(num+"\t");
    }

    static void main() {
        int[] arr={1,2,3,4,5};
        reverse(arr);
    }
}

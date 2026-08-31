package Day_2;

import java.util.Scanner;

public class Remove_Duplicates {
    static int removeDuplicates(int[] arr){
        int slow=0;
//        int fast=1;
//        while(fast!=arr.length) {
//            if (arr[slow] == arr[fast])
//                fast++;
//            else {
//                slow++;
//                arr[slow] = arr[fast];
//                fast++;
//            }
//        }
        for(int fast=1;fast< arr.length;fast++){
            if(arr[slow] != arr[fast]){
                slow++;
                arr[slow]=arr[fast];
            }
        }
        return slow+1;
    }
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array : ");
        int size=sc.nextInt();
        System.out.println("Enter elements of an array : ");
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Final array after removing duplicates : ");
        int num=removeDuplicates(arr);
        for(int i=0;i<num;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}

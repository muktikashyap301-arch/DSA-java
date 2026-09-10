package Practice_Day1;

public class Move_Zeros {
    static void move(int[] arr){
        int slow=0;
        for(int fast=0;fast< arr.length;fast++){
            if(arr[fast]!=0){
                int temp=arr[slow];
                arr[slow]=arr[fast];
                arr[fast]=temp;
                slow++;
            }

        }
        for(int num:arr)
            System.out.print(num+"\t");
    }

    static void main() {
        int[] arr={5,0,3,0,2,0,12};
        move(arr);
    }
}

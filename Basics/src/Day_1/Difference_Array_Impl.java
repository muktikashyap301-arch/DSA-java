package Day_1;

import java.util.Scanner;

public class Difference_Array_Impl {


    record ArrayResult(int[] array,int max){}
    static void updateDiff(int[] diff,int  L, int R,int value){
        diff[L]+=value;
        if((R+1)< diff.length)
            diff[R+1]-=value;
    }

    static ArrayResult finalArray(int[] diff){
        int[] arr= new int[diff.length];
        arr[0]=diff[0];
        int max=diff[0];
        for (int i=1;i< diff.length;i++){
            arr[i]=arr[i-1]+diff[i];
            if(arr[i]>max){
                max=arr[i];
            }
        }
        //System.out.println("Maximum element: "+max);
        return new ArrayResult(arr,max);
    }

    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of difference array: ");
        int size= sc.nextInt();
        int[] diff=new int[size];
        for(int i=0;i<size;i++){
            diff[i]=0;
        }
        System.out.println("Difference Array created");
        System.out.println("Enter number of operations to be performed:");
        int q=sc.nextInt();
        while(q!=0) {
            System.out.println("Enter the operations to be performed in [L,R,value] format : ");
            System.out.print("Enter L :");
            int L = sc.nextInt();
            System.out.print("Enter R :");
            int R = sc.nextInt();
            System.out.print("Enter Value :");
            int value = sc.nextInt();
            System.out.println();
            updateDiff(diff,L,R,value);
            System.out.println("Updated Array: ");
            for(int num:diff)
                System.out.print(num+"\t");
            q--;
        }
        System.out.println("Final array: ");
        Difference_Array_Impl.ArrayResult result =finalArray(diff);
        int[] arr= result.array();
        int max= result.max();
        for(int num:arr){
            System.out.print(num+"\t");
        }
        System.out.println("Maximum element: "+max);
    }
}

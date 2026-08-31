package Day_1;

public class Difference_Array {

    static void updateDiff(int[]diff,int L, int R ,int num){

        diff[L]+=num;
        if( (R+1)<diff.length)
            diff[R+1]-=num;

    }
    static int[] buildUpdatedArray(int[] diff){
        int[] arr=new int[diff.length];
        arr[0]=diff[0];
        for(int i=1;i< diff.length;i++){
            arr[i]=arr[i-1]+diff[i];
        }
        return arr;
    }

    static void main() {
        int[] diff={0,0,0,0,0,0,0};
        updateDiff(diff, 1, 4, 3);
        updateDiff(diff,2,5,5);
        updateDiff(diff , 0,2,2);
        System.out.println("Updated diff : ");
        for(int num:diff){
            System.out.print(num+"\t");
        }
        System.out.println();
        int[] arr=buildUpdatedArray(diff);
        System.out.println("Final updated array is : " );
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}

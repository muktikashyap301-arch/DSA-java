package Practice_Day1;

public class Filter_Min_Max {
    static void minPositive(int[] arr){
        int minPos=Integer.MAX_VALUE;
        for(int num:arr){
            if(num>0 && num<minPos)
                minPos=num;
        }
        System.out.println(minPos);
    }
    static void maxNegative(int[] arr){
        int maxNeg=Integer.MIN_VALUE;
        for(int num:arr){
            if(num<0 && num>maxNeg)
                maxNeg=num;
        }
        System.out.println(maxNeg);
    }

    static void main() {
        int[] arr={0,-5,8,-2,3,1,-7};
        minPositive(arr);
        maxNegative(arr);
    }
}

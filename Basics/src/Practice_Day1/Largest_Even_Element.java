package Practice_Day1;

public class Largest_Even_Element {
    static int large_Even(int[] arr){
        int max_Even=Integer.MIN_VALUE;
        for(int num:arr){
            if((num%2==0 ) & (num > max_Even))
                max_Even=num;
        }
        return max_Even;
    }
    static void main() {
        int [] arr={7,12,5,18,9,20,3};
        System.out.println("largest even number: "+ Largest_Even_Element.large_Even(arr));
    }
}

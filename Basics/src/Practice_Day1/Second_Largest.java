package Practice_Day1;

public class Second_Largest {

    static void secondLargest(int[] arr) {
        int largest = arr[0];
        int secondLargest =arr[1];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i]>largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i]>secondLargest && arr[i]<largest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("Largest: "+largest);
        System.out.println("Second largest: " +secondLargest);
    }
    static void main() {
        int[] arr={10,5,8,20,15};
        secondLargest(arr);
    }
}

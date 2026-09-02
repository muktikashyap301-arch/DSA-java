package Day_3;


public class Dutch_National_Flag {

    static void sortColors(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        while (mid <= high) {

            if (arr[mid] == 0) {
                swap(arr,mid,low);
                low++;
                mid++;
            }
            else if (arr[mid] == 1)
                mid++;
            else {
                swap(arr,mid,high);
                high--;
            }
        }
    }

    private static void swap(int[] arr, int i, int i1) {
        int temp=arr[i];
        arr[i]=arr[i1];
        arr[i1]=temp;
    }

    static void main() {
        int[] arr={2,0,2,1,1,0};
        sortColors(arr);
        System.out.println("Sorted array");
        for (int num:arr)
            System.out.print(num+"\t");
    }
}


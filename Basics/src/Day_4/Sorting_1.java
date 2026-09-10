package Day_4;

public class Sorting_1 {

    static void SelectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex])
                    minIndex=j;
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
        System.out.println("Using Selection Sort: ");
        for(int num:arr){
            System.out.print(num+"\t");
        }
    }
    static void bubbleSort(int[]arr){
        for(int i=0;i<arr.length-1;i++){
            int didSwap=0;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    didSwap++;
                }
            }
            if(didSwap==0)
                break;
        }
        System.out.println("Bubble Sort");
        for(int num:arr)
            System.out.print(num+"\t");
    }
    static void insertionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int j=i;
            while(j>0&& arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        System.out.println("Insertion Sort");
        for(int num:arr)
            System.out.print(num+"\t");
    }

    static void main() {
        int[] arr={10,2,13,4,53,6,27};
        insertionSort(arr);
    }
}

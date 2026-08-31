package Day_2;

import java.util.Scanner;

public class Move_Zeros {
    static int[] moveZeros(int[] arr) {
        int slow = 0;
        for (int fast = 1; fast < arr.length; fast++) {
            if (arr[fast] != 0) {
                int temp = arr[slow];
                arr[slow] = arr[fast];
                arr[fast] = temp;
                slow++;
            }
        }
        return arr;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array : ");
        int size = sc.nextInt();
        System.out.println("Enter elements of an array : ");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Final array after removing duplicates : ");
        arr = moveZeros(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}

package Day_1;

import java.util.Scanner;

public class Easy_Array {
    static int[] arr;
    static int size;
    static int choice;
    static Scanner sc=new Scanner(System.in);

    void max_element(int [] arr){
        int max=arr[0];
        for(int i=1;i<size;i++){
            if(max<arr[i])
                max=arr[i];
        }
        System.out.println("Maximum element of the entered array is : "+max);
    }

    void mix_element(int [] arr){
        int min=arr[0];
        for(int i=1;i<size;i++){
            if(min>arr[i])
                min=arr[i];
        }
        System.out.println("Minimum element of the entered array is : "+min);
    }

    void SumOfAllElements(int [] arr){
        int sum=0;
        for(int i=0;i<size;i++){
            sum+=arr[i];
        }
        System.out.println("Sum of all the elements of the entered array is :"+ sum);
    }

    void count_Odd_And_Even(int[] arr){
        int sum_Even=0;
        int sum_Odd=0;
        for(int i=0;i<size;i++){
            if(arr[i]%2==0)
                sum_Even+=arr[i];
            else
                sum_Odd+=arr[i];
        }
        System.out.println("Sum of all the even elements of the entered array : "+sum_Even);
        System.out.println("Sum of all the odd elements of the entered array : "+sum_Odd);
    }

    void count_Positive_And_Negative(int[] arr){
        int sum_positive=0;
        int sum_negative=0;
        for(int i=0;i<size;i++){
            if(arr[i]>=0)
                sum_positive+=arr[i];
            else
                sum_negative+=arr[i];
        }
        System.out.println("Sum of all the positive elements of the entered array : "+sum_positive);
        System.out.println("Sum of all the negative elements of the entered array : "+sum_negative);
    }

    void display(){
        System.out.println("Select the operation you wanna perform on this array....");
        System.out.println(" 1.Find maximum element ");
        System.out.println(" 2.Find minimum element");
        System.out.println(" 3.Find sum of all elements");
        System.out.println(" 4.Count even and odd numbers");
        System.out.println(" 5.Count positive and negative numbers");
        System.out.println("Enter your choice: ");
        choice=sc.nextInt();

    }

    static void main() {
        //Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array : ");
        size=sc.nextInt();
        System.out.println("Enter elements of an array : ");
        arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        Easy_Array object=new Easy_Array();

        while(true) {
            object.display();
            switch (choice) {
                case 1:
                    object.max_element(arr);
                    break;
                case 2:
                    object.mix_element(arr);
                    break;
                case 3:
                    object.SumOfAllElements(arr);
                    break;
                case 4:
                    object.count_Odd_And_Even(arr);
                    break;
                case 5:
                    object.count_Positive_And_Negative(arr);
                    break;
                default:
                    System.out.println("Invalid choice entered ....Try again ");
            }
            // jump to line 84 . but how??
        }
    }
}

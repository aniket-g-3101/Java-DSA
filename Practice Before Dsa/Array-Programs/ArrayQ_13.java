
//13.Count how many times a number appears in the array

import java.util.Scanner;

public class ArrayQ_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter Array Elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array is : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        int ele;
        int count = 0;
        System.out.println("\nEnter Element to count : ");
        ele = sc.nextInt();
        // This part of the code is counting how many times a specific element (stored
        // in the variable
        // `ele`) appears in the array `arr`.
        for (int num : arr) {
            // This part of the code is checking if the current element `num` in the array
            // is equal to
            // the element `ele` that you want to count. If they are equal, it increments
            // the `count`
            // variable by 1. This way, it keeps track of how many times the specified
            // element `ele`
            // appears in the array.
            if (ele == num) {
                count += 1;
            }
        }
        System.out.println("Element " + ele + " is Appeared " + count + " times in Array");
        sc.close();
    }
}

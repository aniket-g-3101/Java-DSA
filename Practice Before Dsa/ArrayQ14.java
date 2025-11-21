// 14.Check if the array is sorted

import java.util.Scanner;

public class ArrayQ14 {
    public static void main(String args[]) {
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

        boolean isAscending = true;
        boolean isDescending = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isAscending = false;
            }
            if (arr[i] < arr[i + 1]) {
                isDescending = false;
            }
        }

        if (isAscending) {
            System.out.println("\nArray is sorted in ascending order");
        } else if (isDescending) {
            System.out.println("\nArray is sorted in descending order");
        } else {
            System.out.println("\nArray is not sorted");
        }
        sc.close();
    }
}

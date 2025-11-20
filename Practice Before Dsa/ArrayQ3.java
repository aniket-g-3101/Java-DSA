//3.Find the minimum element in an array

import java.util.Scanner;

public class ArrayQ3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter ELements of Array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Your Array is :");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        // `int min = arr[0];` initializes the variable `min` with the first element of
        // the array
        // `arr`. This is done to have a starting point for comparison when finding the
        // minimum element
        // in the array.
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("\nSmallest Element Of Array is :" + min);
        sc.close();
    }

}

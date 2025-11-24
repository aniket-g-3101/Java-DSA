// 10.Find the second largest element

import java.util.Scanner;

public class ArrayQ_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter Elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array is : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        // This part of the code is finding the second largest element in the array
        // `arr`. It initializes two
        // variables `max1` and `max2` to `Integer.MIN_VALUE` to handle cases where the
        // array elements are
        // negative.

        // The line `int max1 = Integer.MIN_VALUE;` is initializing the variable `max1`
        // to the smallest
        // possible integer value in Java, which is `Integer.MIN_VALUE`. This is a
        // common practice when
        // finding the maximum or minimum values in an array or a list, as it ensures
        // that the initial
        // value of `max1` is lower than any other integer value that may be present in
        // the array. This
        // way, the algorithm can correctly update `max1` with the actual maximum value
        // from the array
        // during the iteration process.
        int max1 = Integer.MIN_VALUE;

        int max2 = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num != max1) {
                max2 = num;
            }
        }

        if (max2 == Integer.MIN_VALUE) {
            System.out.println("No second largest element (all elements are same).");
        } else {
            System.out.println("\nSecond largest element is: " + max2);
        }
        sc.close();
    }
}

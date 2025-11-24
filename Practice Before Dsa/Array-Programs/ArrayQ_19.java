//19.Find the difference between max and min

import java.util.Scanner;

public class ArrayQ_19 {
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
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) { // find maximum element from array
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) { // find minimum element from array
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("\nMax Element : " + max);
        System.out.println("Min Element : " + min);
        // This line of code is calculating the difference between the maximum and
        // minimum elements in
        // the array `arr`.
        System.out.println("Difference Between max and min element  : " + (max - min));
        sc.close();
    }
}

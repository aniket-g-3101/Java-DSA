
//20.Merge two arrays into one

import java.util.Scanner;

public class ArrayQ_20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr1[] = new int[10];
        int arr2[] = new int[5];
        System.out.println("Enter Array 1 Elements : ");
        for (int i = 0; i < 5; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter Array 2 Elements : ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        // This part of the code is merging the elements of the second array `arr2` into
        // the first array
        // `arr1`.
        for (int i = 0; i < arr2.length; i++) {
            arr1[5 + i] = arr2[i];
        }

        System.out.println("Merged Array is: ");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
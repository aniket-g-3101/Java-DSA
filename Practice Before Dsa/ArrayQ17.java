// 17.Find the product of all elements

import java.util.Scanner;

public class ArrayQ17 {
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
        // The line `int product = 1;` is initializing a variable named `product` with
        // an initial value
        // of 1. This variable will be used to store the product of all elements in the
        // array. By
        // initializing it to 1, we ensure that when we multiply the elements of the
        // array with this
        // variable, the initial value does not affect the final product.
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }
        System.out.println("Product is : " + product);
        sc.close();
    }
}

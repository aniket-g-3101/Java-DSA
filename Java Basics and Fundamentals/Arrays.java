//Array - Array is a collection of elements having similar data type 
// We use array to store multiple records in a single variable 

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        // Declare: `int[] arr = new int[5];

        int array[] = new int[5];

        // or int array[]={1,2,3,4,5};

        // Give values to array
        array[0] = 10;
        array[1] = 20;

        // access elements using index
        System.out.println("First Element : " + array[0]);
        System.out.println("Second Element : " + array[1]);

        // Access array using for loop

        int array1[] = new int[3];

        // Give values
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Values Of Array : ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = sc.nextInt();
        }

        // Access the Values
        System.out.println("Your Array Is : ");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        sc.close();
    }
}

// The array has Following types -
// 1. 1D (1-Dimentional) Array
// eg. Above Code
// 2. 2D (2-Dimensional) Array
// eg - int array[][] = new int[2][3]
// 2D Array is also called as matrix i.e. it has rows and columns
// 🔄 Control Flow in Java
// Control flow statements decide how your code executes like making choices (if-else) or repeating tasks (loops).
// In DSA, they're used to iterate arrays, check conditions, and control the logic of algorithms.

public class ControlFlow {
    public static void main(String[] args) {
        int num = 10;

        // if else statement

        if (num >= 0) {
            System.out.println("Number is Positive");
        } else {
            System.out.println("Number is Negative");
        }

        // For loop runs code repeatedly for a fixed number of times
        System.out.println("Numbers using for loop");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // while loop runs until condition is TRUE

        int count = 1;
        while (count <= 5)// condition check
        {
            System.out.println(count);
            count++; // increment count by 1
        }

        // break and continue
        System.out.println("Break and Continue Example:");
        for (int j = 1; j <= 5; j++) {
            if (j == 3)
                continue; // skips printing when j = 3
            if (j == 5)
                break; // stops loop completely when j = 5
            System.out.println("j = " + j);
        }

    }
}

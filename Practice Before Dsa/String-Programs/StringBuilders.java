// A StringBuilder in Java is a class used to create and modify strings without creating new string objects every time.

// Common methods:
// append() – add text
// insert() – insert text at a position
// delete() – remove text
// reverse() – reverse the entire string
// toString() – convert it back to a normal String

public class StringBuilders {
    public static void main(String[] args) {

        // The line `StringBuilder sb = new StringBuilder("Aniket");` is creating a new
        // `StringBuilder` object
        // named `sb` with an initial value of "Aniket".
        StringBuilder sb = new StringBuilder("Aniket");
        System.out.println(sb);

        // charAt()
        System.out.println("Character at index 0 : " + sb.charAt(0));

        // insert() - used to insert any character anywhere in string

        // The `insert()` method in the StringBuilder class is used to insert characters
        // or text at
        // snippet, `sb.insert(0, "a");` is inserting the character "a" at the beginning
        // (index 0)
        // of the StringBuilder object `sb`, resulting in the output "aAniket".
        sb.insert(0, "a");
        System.out.println(sb); // aAniket

        // setCharAt() -

        sb.setCharAt(2, 'a'); // here single quote is used while taking second parameter
        System.out.println(sb); // aAaiket

        // `sb.append()` is appending the string to the existing StringBuilder
        // object `sb`. After this operation
        sb.append(" Gavali"); // aAaiket Gavali
        System.out.println(sb);

        // The line `sb.reverse();` is calling the `reverse()` method on the
        // `StringBuilder` object
        // `sb`. This method reverses the characters in the `StringBuilder` object,
        // effectively
        // reversing the entire string that it holds.
        sb.reverse();
        System.out.println(sb);
    }
}

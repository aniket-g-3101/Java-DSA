//String - Character Type Array is called as String
// Strings are immutable, use StringBuilder to modify.

public class Strings {
    public static void main(String[] args) {
        String name = "Aniket";

        // Length and characters
        System.out.println("Length: " + name.length());
        System.out.println("First char: " + name.charAt(0));

        // Substring
        System.out.println("Substring: " + name.substring(1, 4));

        // Comparison
        String another = "Aniket";
        System.out.println(name.equals(another)); // true

        // StringBuilder for modifications
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" Java");
        System.out.println(sb.toString());
    }
}

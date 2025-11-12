// Collections in Java
// Collections are pre-built data structures in Java used to store and manipulate groups of objects.
// They make tasks like searching, sorting, and managing data easier.
// Common types: List (ordered), Set (unique), and Map (key-value pairs).

import java.util.*;

public class CollectionsBasics {
    public static void main(String[] args) {

        // ArrayList - Dynamic array (can grow or shrink)
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("ArrayList: " + list);
        System.out.println("First element: " + list.get(0));
        list.remove(1); // removes element at index 1
        System.out.println("After removing index 1: " + list);

        // HashSet - Stores only unique elements (no duplicates)
        HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("DSA");
        set.add("Java"); // duplicate ignored
        System.out.println("\nHashSet: " + set);
        System.out.println("Contains 'DSA'? " + set.contains("DSA"));

        // HashMap - Stores data as key-value pairs
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Aniket", 21);
        map.put("Riya", 19);
        map.put("Rahul", 22);
        System.out.println("\nHashMap: " + map);
        System.out.println("Aniket's age: " + map.get("Aniket"));

        // Looping through HashMap
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        // Useful Collections for DSA :
        // List = ordered collection (duplicates allowed)
        // Set = unordered collection (unique elements)
        // Map = key-value pairs (keys unique)
        // Queue Interface (FIFO - First In, First Out)
        // Stack - used in recursion, expression evaluation, and DFS.
        // Deque Interface (Double-ended Queue)
    }
}

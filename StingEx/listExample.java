package StingEx;
import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<>();
        
        System.out.println("Initial List: " + al);
        System.out.println("Initial Size: " + al.size());
        
        System.out.println("Is Empty: " + al.isEmpty()); // Checking if the list is empty
        
        // Adding elements
        al.add("hello");
        al.add("abc");
        al.add("ravi");
        al.add(99);
        al.add(99.9);
        
        System.out.println("List after adding elements: " + al);
        
        // Removing all elements
        al.clear(); // Using clear() instead of removeAll(al)
        
        System.out.println("List after clearing: " + al);
    }
}

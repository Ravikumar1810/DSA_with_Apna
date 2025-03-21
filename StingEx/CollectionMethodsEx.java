import java.util.*; 

public class CollectionMethodsEx { 
    public static void main(String[] args) { 
        Collection<String> fruits = new ArrayList<>(); 

       fruits.add("Apple"); 
       fruits.add("Banana"); 
       fruits.add("Mango"); 
       System.out.println("Fruits Collection: " + fruits); 

       fruits.remove("Banana"); 
       System.out.println("After removing Banana: " + fruits); 

      System.out.println("Contains Apple? " + fruits.contains("Apple")); 

      System.out.println("Size of Collection: " + fruits.size()); 

      fruits.clear(); 
      System.out.println("Is Collection Empty? " + fruits.isEmpty()); 
    } 
} 
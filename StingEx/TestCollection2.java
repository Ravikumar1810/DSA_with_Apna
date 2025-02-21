package StingEx;

import java.util.Iterator;
import java.util.LinkedList;

public class TestCollection2 {
    public static void main(String[] args) {
        LinkedList<String> a1 = new LinkedList<String>();
        a1.add("Ravi");
        a1.add("Ajay");
        a1.add("Vijay");
        a1.add("Dhanu");
        Iterator<String> itr= a1.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        a1.remove(2);
        System.out.println(a1);
        a1.add("Chandu");
        System.out.println(a1);
    }
}


package LinkedList;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedlist = new LinkedList<String>();
    
        // Add elements to LinkedList
        linkedlist.add("Delhi");
        linkedlist.add("Agra");
        linkedlist.add("Mysore");
        linkedlist.add("Chennai");
        linkedlist.add("Pune");
    
        /*
         * Iterator
        */ 
        // Obtaining Iterator
        Iterator it = linkedlist.iterator();
    
        // Iterating the list in forward direction
        System.out.println("LinkedList elements:");
        while(it.hasNext()){
            System.out.println(it.next());
        }

        ListIterator list_Iter = linkedlist.listIterator(2); 
  
        // Iterating through the created list from the position 
        System.out.println("*** The list is as follows:"); 
        while(list_Iter.hasNext()){ 
           System.out.println(list_Iter.next()); 
        } 
    }
}

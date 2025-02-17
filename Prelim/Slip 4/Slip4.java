/* Construct a Linked List containing name: CPP, Java, Python and PHP. Then extend
your java program to do the following:
1. Display the contents of the List using an Iterator.
2. Display the contents of the List in reverse order using a ListIterator. */

import java.util.*;

public class Slip4 {
    public static void main(String[] args) {
        
        LinkedList<String> langList = new LinkedList<>();
        langList.add("CPP");
        langList.add("Java");
        langList.add("Python");
        langList.add("PHP");

        // Displaying the list using an Iterator
        System.out.println("Contents of the LinkedList:");
        Iterator<String> itr = langList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Displaying the list in reverse order using ListIterator
        System.out.println("\nContents of the LinkedList in reverse order:");
        ListIterator<String> revItr = langList.listIterator(langList.size());
        while (revItr.hasPrevious()) {
            System.out.println(revItr.previous());
        }
    }
}

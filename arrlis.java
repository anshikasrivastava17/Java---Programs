/* Write a program for the following 
•	Read all elements from ArrayList by using Iterator.
•	Create duplicate object of an ArrayList instance.
•	Reverse ArrayList content. */

import java.util.*;

class arrlis {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Anshika");
        al.add("Mariette");
        al.add("Christina");

        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // DUPLICATE
        ArrayList<String> duplicateAl = (ArrayList<String>) al.clone();

        Iterator itr2 = duplicateAl.iterator();
        System.out.println("in duplicate list");
        while (itr2.hasNext()) {

            System.out.println(itr2.next());
        }

        // REVERSING
        for (int i = al.size() - 1; i >= 0; i--) {
            System.out.println(al.get(i));
        }
    }
}

/* Write a program for the following HashSet

•	copy another collection object to HashSet object.
•	delete all entries at one call from HashSet
•	search user defined objects from HashSet */

import java.util.*;
public class Hashsetss {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("Anshika");
        set.add("Taiyaba");

        ArrayList<String> al = new ArrayList<String>();
        al.add("Anshika");
        al.add("Mariette");
        al.add("Christina");

        set.addAll(al);
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        set.clear();
        if (set.isEmpty())
            System.out.println("true");
    }
}

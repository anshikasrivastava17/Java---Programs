/* Write a program for the following HashMap
•	find whether specified key exists or not.
•	find whether specified value exists or not
•	get all keys from the given HashMap
•	get all key-value pair as Entry objects */

import java.util.*;

public class Hashmaps {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Unary");
        map.put(2, "Binary");
        map.put(3, "Ternary");

        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("hi"));

        // GET All KEYS
        for (Integer key : map.keySet()) {
            System.out.println(key);
        }
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}

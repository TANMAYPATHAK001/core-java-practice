package basics;

import java.util.HashMap;

public class Hashmaps {
    public static void main(String[] args) {

        // Hashmap = A data structure that stores key-value pairs
        //           Keys are unique, but values can be duplicated
        //           Does not maintain any order but is memory efficient
        //           Hashmap<Key, Value>

        HashMap<String, Double> map = new HashMap<>();

        map.put("apple", 66.0);
        map.put("banana", 32.0);
        map.put("orange", 55.0);

        // map.remove("apple");
        // System.out.println(map);
        // System.out.println(map.containsKey("apple"));

//        if (map.containsKey("apple")) {
//            System.out.println(map.get("apple"));
//        }
//        else {
//            System.out.println("Key not found!");
//        }

        // System.out.println(map.containsValue(32.0));
        // System.out.println(map.size());

        for (String key : map.keySet()){
            System.out.println(key + " : Rs" + map.get(key));
        }
    }
}

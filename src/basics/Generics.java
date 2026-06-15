package basics;

import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {

        // Generics = A concept where one can write a class, interface or method
        //            that is compatible with different data types
        //            <T> type parameter (placeholder that gets replaced with real type)
        //            <String> type argument (specifies the type)

//        ArrayList<String> fruits = new ArrayList<>();
//
//        fruits.add("apple");
//        fruits.add("orange");
//        fruits.add("banana");

//        Box<String> box = new Box<>();
//
//        box.setItem("banana");
//        System.out.println(box.getItem());

        Product<String, Double> product = new Product<>("apple", 65.8);

        System.out.println(product.getItem());
        System.out.println(product.getPrice());
    }
}

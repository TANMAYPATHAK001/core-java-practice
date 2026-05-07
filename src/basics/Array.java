package basics;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        // array = a collection of values of the same data type
        //         * think of it as a variable that can store more than 1 value*

        String[] fruit = {"Apple", "Orange", "Banana", "Coconut"};

        //fruit[0] = "pineapple";
        //int numOfFruit = fruit.length;
        // Arrays.sort(fruit);
        //Arrays.fill(fruit, "Pineapple");

//        for (int i = 0; i < fruit.length; i++) {
//            System.out.print(fruit[i] + " ");
//        }

        //Enhanced for loop
        for (String fruits : fruit){
            System.out.println(fruits);
        }


    }
}
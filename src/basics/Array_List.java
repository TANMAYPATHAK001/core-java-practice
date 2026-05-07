package basics;

import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {

        // Array list = A resizable array that stores object (autoboxing)
        //              Arrays are fixed in size, but Arraylists can change.

        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(1);
        list.add(2);

//        list.remove(0);
//        list.set(0, 69);

//        System.out.println(list.get(0);
//        System.out.println(list.size());

//        Collections.sort(list);
//        System.out.println(list);

        for (Integer lists : list){
            System.out.println(lists);
        }

    }
}
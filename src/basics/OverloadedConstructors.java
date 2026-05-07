package basics;

public class OverloadedConstructors {
    public static void main(String[] args) {

        // overloaded constructors = Allow a class to have multiple constructors
        //                           with different parameters lists.
        //                           Enable objects to be initialized in various ways.


        User user1 = new User("Jhingur");
        User user2 = new User("Langur", "JingJing12@gmail.com");
        User user3 = new User("Chumur", "Mulmaar52@gmail.com", 21);
        User user4 = new User();

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);

//        System.out.println(user1.username);
//        System.out.println(user1.email);
//        System.out.println(user1.age);
//
//        System.out.println(user2.username);
//        System.out.println(user2.email);
//        System.out.println(user2.age);
//
//        System.out.println(user3.username);
//        System.out.println(user3.email);
//        System.out.println(user3.age);

    }
}





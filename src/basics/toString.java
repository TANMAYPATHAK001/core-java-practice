package basics;

public class toString {
    public static void main(String[] args) {


        // .toString() = Method inherited from the object class.
        //               Used to return a string representation of an object.
        //               By default, it returns a hash code as a unique identifier.
        //               It can be overridden to provide meaningful details.

        Car car = new Car("Skoda", "Kylaq", 2024, "Brilliant Silver");
        Car car2 = new Car("Mahindra", "3XO", 2024, "Galaxy Grey");

        System.out.println(car);
        System.out.println(car2);

    }
}



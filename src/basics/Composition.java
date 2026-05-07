package basics;

public class Composition {
    public static void main(String[] args) {

        // Composition = Represents a "part-of" relationship b/w objects.
        //               For example, an engine is "part-of"  a car.
        //               Allows complex objects to be constructed from smaller objects.


        Car2 car = new Car2("i20", 2025, "N-line");

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);

        car.start();

    }
}




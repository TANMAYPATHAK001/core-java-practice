package basics;

public class ArrayofObjects {
    public static void main(String[] args) {

        // Car car1 = new Car("Kylaq", "Grey");
        // Car car2 = new Car("3xo", "Grey");
        //Car car3 = new Car("Brezza", "Magma Grey");

        // Car[] cars = {car1, car2, car3};

        // OR

        Car4[] cars4 = { new Car4("Kylaq", "Grey"),
                new Car4("3xo", "Grey"),
                new Car4("Brezza", "Grey")};

//        for (int i = 0; i < cars.length; i++) {
//            cars[i].drive();
//        }

        // OR

        for (Car4 car : cars4){
            car.color = "black";
        }
        for (Car4 car : cars4){
            car.drive();
        }

    }
}



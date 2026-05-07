package basics;

public class Getters_Setters {
    public static void main(String[] args) {

        // They help protect object data and add rules for accessing or modifying them.
        // GETTERS = methods that make a field READABLE
        // SETTERS = methods that make a field WRITABLE


        Car1 car = new Car1("Exter", "grey", 900000);

        car.setColor("White");
        car.setPrice(914000);

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice() + " ");
    }
}
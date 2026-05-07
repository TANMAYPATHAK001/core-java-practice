package basics;

public class Car4 {

    String model;
    String color;

    Car4 (String model, String color){
        this.model = model;
        this.color = color;
    }

    void drive(){
        System.out.println("You drive the " + this.color + " " + this.model);
    }
}

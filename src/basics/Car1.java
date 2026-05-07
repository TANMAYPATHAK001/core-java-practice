package basics;

public class Car1 {

    private final String model;
    private String color;
    private int price;

    Car1(String model, String color, int price){
        this.model = model;
        this.color = color;
        this.price = price;
    }

    String getModel(){
        return this.model;
    }
    String getColor(){
        return this.color;
    }
    String getPrice(){
        return "Rs" + this.price;
    }

    void setColor(String color){
        this.color = color;
    }
    void setPrice(int price){
        if (price < 0) {
            System.out.println("Price cannot be less than zero");
        }
        else{
            this.price = price;
        }
    }
}
package basics;

public class Inheritance {
    public static void main(String[] args) {

        // Inheritance = One class inherits the attributes and methods
        //               from another class.
        //               Child <- Parent <- Grandparent

        Dog3 dog3 = new Dog3();
        Cat3 cat3 = new Cat3();
        Plant plant = new Plant();

        System.out.println(dog3.isAlive);
        System.out.println(cat3.isAlive);
        System.out.println(plant.isAlive);

        dog3.eat();
        cat3.eat();
        plant.photosynthesize();


        System.out.println(dog3.lives);
        System.out.println(cat3.lives);

        dog3.speak();
        cat3.speak();

    }
}



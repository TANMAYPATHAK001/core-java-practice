package basics;

public class OverloadedMethods {
    public static void main(String[] args) {

        // overloaded methods = methods that share the same name,
        //                      but different parameters
        //                      signature = name + parameters

        System.out.println(add(1,2, 3));

    }
    static double add(double a, double b){
        return a + b;
    }
    static double add(double a, double b, double c){
        return a + b + c;
    }
}


//public class Main {
//    public static void main(String[] args) {
//
//        // overloaded methods = methods that share the same name,
//        //                      but different parameters
//        //                      signature = name + parameters
//
//
//        String pizza = bakePizza("flat bread", "mozzarella", "Pepperoni");
//        System.out.println(pizza);
//    }
//    static String bakePizza(String bread){
//        return bread + " pizza";
//    }
//    static String bakePizza(String bread, String cheese){
//        return cheese + " " + bread + " pizza";
//    }
//    static String bakePizza(String bread, String cheese, String toppings){
//        return toppings + " " + cheese + " " + bread + " pizza";
//    }
//}
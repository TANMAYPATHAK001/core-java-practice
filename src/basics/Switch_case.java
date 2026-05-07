package basics;

import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {


        // Enhanced Switch = A replacement to many else if statements
        //                   (Java 14 feature)

        String day;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a day of the week: ");
        day = scanner.nextLine();

//        switch (day){
//            case "Monday" -> System.out.println("It is a Week day.");
//            case "Tuesday" -> System.out.println("It is a Week day.");
//            case "Wednesday" -> System.out.println("It is a Week day.");
//            case "Thursday" -> System.out.println("It is a Week day.");
//            case "Friday" -> System.out.println("It is a Week day.");
//            case "Saturday" -> System.out.println("It is a Weekend.");
//            case "Sunday" -> System.out.println("It is a Weekend.");
//            default -> System.out.println(day + " is not a day!");
//        }

        switch (day){
            case "Monday" ,"Tuesday","Wednesday","Thursday","Friday" ->
                    System.out.println("It is a Week day.");
            case "Saturday", "Sunday" ->
                    System.out.println("It is a Weekend.");
            default -> System.out.println(day + " is not a day!");
        }
    }
}
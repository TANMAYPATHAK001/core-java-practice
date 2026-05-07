package basics;

import java.util.Scanner;

public  class AndOrNot {
    public static void main(String[] args) {

        // && = AND
        // || = OR
        // ! = NOT

        Scanner scanner = new Scanner(System.in);

        // username must be b/w 4-12 characters
        // username must not contain spaces or underscores

        String username;

        System.out.print("Enter your new username: ");
        username = scanner.nextLine();

        if(username.length() < 4 || username.length() > 12){
            System.out.println("Username must be b/w 4-12 characters!");
        }
        else if(username.contains(" ") || username.contains("_")){
            System.out.println("Username must not contain spaces or underscores");
        }
        else{
            System.out.println("Welcome, " + username + "🙏");
        }

        scanner.close();

//        double temp = 50;
//        boolean isSunny = true;

//        if(temp <= 30 && temp >= 0 && isSunny){
//            System.out.println("The Weather is good");
//            System.out.println("It is Sunny outside");
//        }
//        else if(temp <= 30 && temp >= 0 && !isSunny){
//            System.out.println("It is cloudy outside");
//            System.out.println("The Weather is good");
//        }
//        else if(temp > 30 || temp < 0){
//            System.out.println("The weather is bad");
//        }
    }
}
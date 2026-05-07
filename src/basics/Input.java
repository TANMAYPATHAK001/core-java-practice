package basics;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner banner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = banner.nextInt();
        banner.nextLine();

        System.out.print("Enter your name: ");
        String name = banner.nextLine();


        System.out.print("How much your bike worth? ");
        float price = banner.nextFloat();

        System.out.print("Are you a student? (true/false) ");
        boolean isStudent = banner.nextBoolean();

        System.out.println("lolololo " + name);
        System.out.println("You are " + age + " years old.");
        System.out.println("Parle-G " + price);

        if(isStudent){
            System.out.println("Chala ja..");
        }
        else{
            System.out.println("aja-aja, aja-aja aja");
        }

        banner.close();
    }
}

// Calculate area of a rectangle

//Scanner manner = new Scanner(System.in);
//        System.out.print("Enter the length of the rectangle: ");
//double length = manner.nextDouble();
//
//        System.out.print("Enter the breadth of the rectangle: ");
//double breadth = manner.nextDouble();
//
//double area = length * breadth;
//
//        System.out.println("Area of the rectangle is: " + area + " cm");
//
//    }
//            }
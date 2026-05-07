package projects;

import java.sql.SQLOutput;
import java.util.Scanner;
public class BillCalculator{
    public static void main(String []args){

        // BILL CALCULATOR

        Scanner shopping = new Scanner(System.in);

        String item ;
        double price ;
        int quantity;
        String currency = "Rs";
        double total;

        System.out.print("Enter your item: ");
        item = shopping.nextLine();

        System.out.print("What is the price for each? ");
        price = shopping.nextDouble();

        System.out.print("What is the quantity of item? ");
        quantity = shopping.nextInt();

        total = price * quantity;


        System.out.println("You have bought: " + quantity + " " + item + "/s");
        System.out.print("Your total bill is: " + currency + total);

        shopping.close();
    }
}

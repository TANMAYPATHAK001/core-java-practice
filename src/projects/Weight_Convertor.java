package projects;

import java.util.Scanner;

public class Weight_Convertor {
    public static void main(String[] args) {

        Scanner conversion = new Scanner(System.in);

        // WEIGHT CONVERTER PROGRAM

        // Declare variables
        double weight;
        double newWeight;
        int choice;

        // Welcome message
        System.out.println("Weight Conversion Program");
        System.out.println("Type 1 to Convert lbs to kgs");
        System.out.println("Type 2 to Convert kgs to lbs");

        // prompt for user input
        System.out.print("Choose an Option! ");
        choice = conversion.nextInt();

        // option 1: convert lbs to kgs
        if(choice == 1){
            System.out.print("Enter the weight in lbs: ");
            weight = conversion.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The new weight in kgs is: %.3fkg",newWeight);

        }
        // option 2: convert kgs to lbs
        else if (choice == 2){
            System.out.println("Enter the weight in kgs: ");
            weight = conversion.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The new weight in lbs is: %.3flbs", newWeight);
        }
        // else print not valid choice
        else{
            System.out.println("That was not a valid choice!");
        }

        conversion.close();
    }
}

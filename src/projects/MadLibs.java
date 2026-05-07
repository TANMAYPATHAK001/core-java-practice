package projects;

import java.util.Scanner;
public class MadLibs {
    public static void main(String[] args) {

        // MAD LIBS GAME

        Scanner gamer = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("\nEnter an adjective (description): ");
        adjective1 = gamer.nextLine();
        System.out.print("Enter a noun (animal or human): ");
        noun1 = gamer.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective2 = gamer.nextLine();
        System.out.print("Enter a verb with -ing (action): ");
        verb1 = gamer.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective3 = gamer.nextLine();


        System.out.println("Today i went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibit, I saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println(" I was " + adjective3 + "!");

        gamer.close();

    }
}

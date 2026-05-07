package projects;

import java.util.Scanner;

public class Temp_Convertor{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double temperature;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temperature = scanner.nextDouble();

        System.out.println("Convert to Celsius or Fahrenheit? (C or F)");
        unit = scanner.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temperature - 32) * 5 / 9 : (temperature * 5 / 9) + 32;

        System.out.printf("%.1f%s", newTemp, unit);
        scanner.close();
    }
}

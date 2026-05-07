package projects;

import java.util.Scanner;
public class Sphere {
    public static void main(String[] args) {

        // Circumference = 2 * Math.PI * radius;
        // Area = Math.PI * Math.pow(radius, 2);
        // Volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        Scanner scanner = new Scanner(System.in);

        double r;
        double a;
        double b;
        double c;

        System.out.print("Enter the radius of Sphere: ");
        r = scanner.nextDouble();

        a = 2 * Math.PI * r;
        b = Math.PI * Math.pow(r, 2);
        c = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);

        System.out.printf("Circumference of the sphere is: %.1fcm\n",a);
        System.out.printf("Area of the sphere is: %.1fcm^2\n", b);
        System.out.printf("Volume of the sphere is: %.1fcm^3\n", c);


        scanner.close();

    }
}
package projects;

public class MethodExamples{
    public static void main(String[] args) {

        // method = a block of reusable code that is executed when called()
        // () = like Telephones

        System.out.println(square(3));
        System.out.println(cube(2));
        System.out.println(getFullName("Tanmay", "Pathak"));

        int age = 21;
        if (ageCheck(age)) {
            System.out.println("You may sign up.");
        }
        else{
            System.out.println("You are not old enough");
        }

    }
    static double square(double number){
        return number * number;
    }
    static double cube(double number){
        return number * number * number;
    }
    static String getFullName(String first, String last){
        return first + " " + last;
    }
    static boolean ageCheck(int age){
        if (age >= 18){
            return true;
        }
        else {
            return false;
        }
    }

}

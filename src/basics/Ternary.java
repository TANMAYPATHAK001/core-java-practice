package basics;

public class Ternary {
    public static void main(String[] args) {

        // Ternary operator (?) = Return 1 of 2 values if a condition is true

        // Variables = (condition) ? ifTrue : ifFalse;

        int income = 30000;

        double taxRate = (income >= 25000) ? 28.0 : 18.0;

        System.out.printf("Your Tax rate is: %.2f%%", taxRate);


//        int score = 70;
//
//        String passOrFail = (score >= 60) ? "Pass" : "Fail";
//
//        System.out.println(passOrFail);

        // 👆 Same-Same 👇

//        if(score>=60){
//            System.out.println("Pass");
//        }
//        else{
//            System.out.println("Fail");
//        }
    }
}
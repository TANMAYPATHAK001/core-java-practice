package basics;

import java.util.Scanner;
public class if_else{
    public static void main(String []args){

        Scanner data = new Scanner(System.in);

        String name;
        int age;
        boolean isStudent;

        System.out.print("Enter your name: ");
        name = data.nextLine();

        System.out.print("Enter the age: ");
        age = data.nextInt();

        System.out.print("Are you a prisoner in school? (true/false): ");
        isStudent = data.nextBoolean();


        //GROUP 1
        if(name.isEmpty()){
            System.out.println("you didn't type the name!👺 ");
        }
        else{
            System.out.println("MeHow " + name + "!🤡" );
        }


        // GROUP 2
        if(age > 150){
            System.out.println("You are a God.☯️");
        }
        else if(age >= 18){
            System.out.println("You are an adult.🥸");
        }
        else if(age >=0){
            System.out.println("You are a Chicken.🐣");
        }
        else if(age < 0){
            System.out.println("You are a Chupacabra.");
        }
        else{
            System.out.println("You have 2 brain cells.👹");
        }



        //GROUP 3

        if(isStudent){
            System.out.println(" And you are a prisoner!👽");
        }
        else{
            System.out.println(" And you are free!🫡");
        }

        data.close();
    }
}

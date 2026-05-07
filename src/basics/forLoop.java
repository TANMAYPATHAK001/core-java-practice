package basics;

import java.util.Scanner;

public  class forLoop {
    public static void main(String[] args) {

        // for loop = execute some code for certain amount of times

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many times you want to loop? ");
        int max = scanner.nextInt();

        for (int i = 1; i <= max; i++){
            System.out.println(i);
        }

        scanner.close();

//        for (int i = 1; i <= 10; i+=3){
//            System.out.println(i);
//        }
    }
}
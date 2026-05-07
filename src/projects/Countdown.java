package projects;

import java.util.Scanner;

public  class Countdown {
    public static void main(String[] args) throws InterruptedException {

        // for loop = execute some code for certain amount of times

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many seconds to countdown from? ");
        int start = scanner.nextInt();

        for(int i = start; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Happy New Year🎉");

        scanner.close();

    }
}

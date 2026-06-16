package basics;

public class Multithreading {
    public static void main(String[] args) {

        //Multithreading = Enables a program to run multiple threads concurrently
        //                 (Thread = A set of instructions that run independently)
        //                 Useful for background task or time-consuming operations


        //MyRunnable2 myRunnable2 = new MyRunnable2();
        Thread thread1 = new Thread(new MyRunnable2("PING"));
        Thread thread2 = new Thread(new MyRunnable2("PONG"));

        System.out.println("GAME START!");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        }
        catch (InterruptedException e){
            System.out.println("Main thread was interrupted!");
        }



        System.out.println("GAME OVER!");

    }

}

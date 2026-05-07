package basics;

import java.util.Random;
public class Randoms{
    public static void main(String[]args){

        Random pandam = new Random();

        int number1;
        double germs;
        float bunker;
        boolean isHeads;

        number1 = pandam.nextInt(1,101);
        germs = pandam.nextDouble(1.0,101.0);
        bunker = pandam.nextFloat(1.1f,101.0f);
        isHeads = pandam.nextBoolean();


        System.out.println(number1);
        System.out.println(germs);
        System.out.println(bunker);
        System.out.println(isHeads);
        if(isHeads){
            System.out.println("It is Heads!👍");
        }
        else{
            System.out.println("It is Tails!👎");
        }

    }
}

package basics;

public class Break_Continue{
    public static void main(String []args){

        // Break = break out of the loop (STOP)
        // Continue = skip current iteration of loop (SKIP)

        for(int i = 0; i < 10; i++){

            if(i == 5){
                break;
            }
            System.out.println(i + " ");
        }

//        for(int i = 0; i < 10; i++){
//
//            if(i == 5){
//                continue;
//            }
//            System.out.println(i + " ");
//        }

    }
}
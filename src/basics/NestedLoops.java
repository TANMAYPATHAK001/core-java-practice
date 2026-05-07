package basics;

public class NestedLoops{
    public static void main(String[] args) {

        // nested loop = A loop in another loop
        //               (Used often with matrices or DSA)

        for(int i = 1; i<=3; i++){
            for(int j = 1; j<=9; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
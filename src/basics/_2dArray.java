package basics;

public class _2dArray {
    public static void main(String[] args) {

        // 2d = An array where each element is an array
        //      useful for storing a matrix of data

        String[] fruits = {"apple", "orange", "banana"};
        String[] vegetables = {"potatao", "onion", "carrot"};
        String[] meats = {"chicken", "pork", "beef", "fish"};

//        String[][] groceries = {fruits, vegetables, meats};
        String[][] groceries = {{"apple", "orange", "banana"},
                {"potatao", "onion", "carrot"},
                {"chicken", "pork", "beef", "fish"}};

        groceries[0][0] = "punyapple";

        for(String[] foods : groceries){
            for (String food : foods){
                System.out.print(food + " ");

            }
            System.out.println();
        }

    }
}
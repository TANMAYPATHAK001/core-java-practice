package basics;

public class printf {
    public static void main(String[] args) {

        // printf = is a method used to format output

        // %[flags][width][.precision][specifier-character]

        //[Specifier-character]

//        String name = "Courage";
//        char firstLetter = 'Z';
//        int age = 69;
//        double height = 2.3;
//        boolean wasGood = true;
//
//
//        System.out.printf("%s was the cowardly dog.\n", name);
//        System.out.printf("His name starts with a: %c\n", firstLetter);
//        System.out.printf("He is %d years old.\n", age);
//        System.out.printf("He was %.2f millimetres tall.\n", height);
//        System.out.printf("Was that a good cartoon? %b\n", wasGood);
//
//        System.out.printf("%s was %.2f feet tall.", name, height);

        // [.precision]

//        double price1 = 9.99;
//        double price2 = 9999.9;
//        double price3 = -29.99;
//
//        System.out.printf("%.2f \n", price1);
//        System.out.printf("%.2f \n", price2);
//        System.out.printf("%.2f \n", price3);

        // [flags]

        // + = output a plus(only plus symbol before positive no.)
        // , = comma grouping separator(hazaar ke baad comma)
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive

        double price1 = 9.99;
        double price2 = 99.9;
        double price3 = -29.99;

//        System.out.printf("%+.2f \n", price1);
//        System.out.printf("%+.2f \n", price2);
//        System.out.printf("%+.2f \n", price3);

//        System.out.printf("%,.2f \n", price1);
//        System.out.printf("%,.2f \n", price2);
//        System.out.printf("%,.2f \n", price3);

//        System.out.printf("%(.2f \n", price1);
//        System.out.printf("%(.2f \n", price2);
//        System.out.printf("%(.2f \n", price3);

//        System.out.printf("% .2f \n", price1);

        //[width]

        // 0 = zero padding(writing zeroes before the numbers)
        // number = right justified padding(before no., only space no 0)
        // negative number = left justified padding (after no. only space no 0)

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

//        System.out.printf("%04d\n", id1);
//        System.out.printf("%04d\n", id2);
//        System.out.printf("%04d\n", id3);
//        System.out.printf("%04d", id4);

//        System.out.printf("%4d\n", id1);
//        System.out.printf("%4d\n", id2);
//        System.out.printf("%4d\n", id3);
//        System.out.printf("%4d", id4);

//        System.out.printf("%-4d\n", id1);
//        System.out.printf("%-4d\n", id2);
//        System.out.printf("%-4d\n", id3);
//        System.out.printf("%-4d", id4);

    }
}

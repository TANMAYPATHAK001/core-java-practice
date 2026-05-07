package basics;

public class WrapperClass {
    public static void main(String[] args) {

        // Wrapper classes = Allow primitive = values (int, char, double, boolean)
        //                   to be used as objects. "Wrap them in an object"
        //                   Generally, don't wrap primitive unless you need an object.
        //                   Allows use of Collections Framework and Static Utility methods.

        // VISUALIZATION PURPOSE ONLY
//        Integer a = new Integer(123);
//        Double b = new Double(3.14);
//        Character c = new Character('$');
//        Boolean d = new Boolean(true);

        // AUTOBOXING
//        Integer a = 123;
//        Double b = 3.14;
//        Character c = '$';
//        Boolean d = true;
        //String e = "Pizza";

        // UNBOXING
//        int x = a;    // Likewise other three


//        String a = Integer.toString(123);
//        String b = Double.toString(3.14);
//        String c = Character.toString('$');
//        String d = Boolean.toString(true);
//
//        String x = a+b+c+d;
//        System.out.println(x);


//        int a = Integer.parseInt("123");
//        double b = Double.parseDouble("3.14");
//        char c = "Pizza".charAt(0);
//        boolean d = Boolean.parseBoolean("true");
//
//        String x = a+b+c+d;
//        System.out.println(x);

        // Utility Methods
        char letter = '$';

        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));

    }
}
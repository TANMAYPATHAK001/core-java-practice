package basics;

public class VariableScope {

    static int x = 1; // CLASS

    public static void main(String[] args) {

        // variable scope = where a variable can be accessed

        int x = 1;  // Local Variable

        System.out.println(x);

        doSomething();
    }
    static void doSomething(){
        int x = 2;  // Local Variable

        System.out.println(x);
    }
}
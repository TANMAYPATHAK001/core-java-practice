package basics;

public class Anonymous_class {
    public static void main(String[] args) {

        // Anonymous classes = A class that doesn't have a name. Cannot be reused.
        //                     Add custom behaviour without having to create a new class.
        //                     Often used for one time uses (TimerTask, Runnable, Callbacks)

        Dog4 dog = new Dog4();
        Dog4 dog2 = new Dog4(){
          @Override
          void speak() {
              System.out.println("Courage says *ha-ha-ha-ha-ha*");
            }
          };

        dog.speak();
        dog2.speak();
    }
}

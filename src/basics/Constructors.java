package basics;

public class Constructors {
    public static void main(String[] args) {

        // Constructors = A special method to initialize objects
        //                You can pass arguments to a constructor
        //                and set up initial values

        Student2 student1 = new Student2("Paplu", 20, 5.0);
        Student2 student2 = new Student2("Jhaplu", 69, 3.2);
        Student2 student3 = new Student2("Taplu", 2, 6.0);


        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.GPA);
        System.out.println(student1.isEnrolled);
        student1.study();

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.GPA);
        System.out.println(student2.isEnrolled);
        student2.study();

        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.GPA);
        System.out.println(student3.isEnrolled);
        student3.study();



    }
}




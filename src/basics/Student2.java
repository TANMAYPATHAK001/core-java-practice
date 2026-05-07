package basics;

public class Student2 {

    String name;
    int age;
    double GPA;
    boolean isEnrolled;

    Student2(String name, int age, double GPA){
        this.name = name; //(this = obj. we're currently working with. ex-student1)
        this.age = age;
        this.GPA = GPA;
        this.isEnrolled = true;
    }

    void study(){
        System.out.println(this.name + " is studying");
    }
}

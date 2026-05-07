package basics;

public class Super {
    public static void main(String[] args) {

        // super = Refers to the parent class (subclass <- superclass)
        //         Used in constructors and method overriding
        //         Calls the parent constructor to initialize attributes


        Person person = new Person("Gabimaru", "Yadav");
        Student student = new Student("Bandbudh and", "Budbak", 2.3);
        Employee employee = new Employee("Tanmay", "Pathak", 25000);

        employee.showSalary();
        student.showGpa();
        person.showName();
    }
}



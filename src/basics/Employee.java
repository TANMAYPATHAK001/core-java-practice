package basics;

public class Employee extends Person{

    int salary;

    Employee(String first, String last, int salary){
        super(first,last);
        this.salary = salary;
    }

    void showSalary(){
        System.out.println(this.first + " gets Rs" + this.salary + " as salary");
    }
}

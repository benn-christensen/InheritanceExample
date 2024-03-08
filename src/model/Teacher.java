package model;

public class Teacher extends Person {
    private double salary;

    public Teacher(String name, Address address, double salary) {
        super(name, address);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

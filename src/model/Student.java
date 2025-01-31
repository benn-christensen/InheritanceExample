package model;

import model.Person;

public class Student extends Person {
    private double gradeAverage;

    public Student(String name, Address address, double gradeAverage) {
        super(name, address);
        this.gradeAverage = gradeAverage;
    }

    public double getGradeAverage() {
        return gradeAverage;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("gradeAverage = " + gradeAverage);
    }

    @Override
    public String toString() {
        return " ";
    }
}

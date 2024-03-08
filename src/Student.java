public class Student {
    private String name;
    private String address;
    private double gradeAverage;

    public Student(String name, String address, double gradeAverage) {
        this.name = name;
        this.address = address;
        this.gradeAverage = gradeAverage;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getGradeAverage() {
        return gradeAverage;
    }
}

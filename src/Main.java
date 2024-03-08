import model.Address;
import model.Student;
import model.Teacher;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Sønderhøj", "30", "8260");
        Student lasse = new Student("Lasse", address, 12);
        Teacher hanne = new Teacher("Hanne Sommer", address, 45000);
        System.out.println(lasse.getName());
    }
}

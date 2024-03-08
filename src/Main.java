import model.Address;
import model.Person;
import model.Student;
import model.Teacher;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Sønderhøj", "30", "8260");
        Student lasse = new Student("Lasse", address, 12);
        Teacher hanne = new Teacher("Hanne Sommer", address, 45000);
        Person[] people = new Person[2];
        people[0] = lasse;
        people[1] = hanne;
        for (Person person : people) {
            person.print();
        }
    }
}

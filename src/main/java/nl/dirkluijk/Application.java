package nl.dirkluijk;

import nl.dirkluijk.enums.Gender;

import java.util.Arrays;
import java.util.List;

/**
 * @author Dirk Luijk <dirk@luijk.nl>
 */
public class Application {

    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
                new Person("John Doe", Gender.MALE, 24, true),
                new Person("Dona Rosamond", Gender.FEMALE, 16, true),
                new Person("Kennedy Dewayne", Gender.MALE, 39, false),
                new Person("Merritt Jack", Gender.MALE, 17, false),
                new Person("Freya Garnette", Gender.FEMALE, 36, false),
                new Person("Eleanore Floretta", Gender.FEMALE, 65, true),
                new Person("John Doe", Gender.MALE, 9, true)
        );

        Printer p = new Printer();

        p.printPersons(persons, new Condition() {
            public boolean matches(Person person) {
                return person.getGender() == Gender.FEMALE;
            }
        });

        System.out.println("====");

        p.printPersons(persons, new Condition() {
            public boolean matches(Person person) {
                return person.getAge() < 20;
            }
        });
    }
}

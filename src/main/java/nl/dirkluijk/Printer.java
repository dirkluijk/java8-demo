package nl.dirkluijk;

import nl.dirkluijk.enums.Gender;

import java.util.List;

/**
 * @author Dirk Luijk <dirk@luijk.nl>
 */
public class Printer {

    /**
     * Prints all persons
     */
    public void printPersons(List<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }

    /**
     * Prints only females
     */
    public void printFemales(List<Person> persons) {
        for (Person person : persons) {
            if (person.getGender() == Gender.FEMALE) {
                System.out.println(person);
            }
        }
    }

    /**
     * Prints all persons below a given age
     */
    public void printBelowAge(List<Person> persons, int maxAge) {
        for (Person person : persons) {
            if (person.getAge() < maxAge) {
                System.out.println(person);
            }
        }
    }
}

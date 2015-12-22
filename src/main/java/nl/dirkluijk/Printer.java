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
     * Prints all persons that match a given condition
     */
    public void printPersons(List<Person> persons, Condition<Person> condition) {
        for (Person person : persons) {
            if (condition.matches(person)) {
                System.out.println(person);
            }
        }
    }
}

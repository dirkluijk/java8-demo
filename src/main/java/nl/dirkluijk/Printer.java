package nl.dirkluijk;

import java.util.List;

/**
 * @author Dirk Luijk <dirk@luijk.nl>
 */
public class Printer {

    public void printPersons(List<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }

}

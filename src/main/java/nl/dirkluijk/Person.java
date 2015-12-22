package nl.dirkluijk;

import nl.dirkluijk.enums.Gender;

/**
 * @author Dirk Luijk <dirk@luijk.nl>
 */
public class Person {
    private String name;
    private Gender gender;
    private int age;
    private boolean available;

    public Person(String name, Gender gender, int age, boolean available) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", available=" + available +
                '}';
    }
}

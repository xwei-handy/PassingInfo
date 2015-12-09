package xizz.passinginfo;

import java.util.ArrayList;

public class Address {
    private String street = "3333 Boardway";
    private ArrayList<Person> residences = new ArrayList<>();

    public Address() {
        residences.add(new Person("Tom", 10));
        residences.add(new Person("Jerry", 8));
    }


    @Override
    public String toString() {
        String display = street + "\n";
        for (Person person : residences)
            display += person + "\n";
        return display;
    }
}

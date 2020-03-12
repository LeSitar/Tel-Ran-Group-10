package telran.personApp;

import telran.data.Address;
import telran.data.Person;

import static telran.data.Person.findByName;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Jevgenijs",new Address());
        p1.setAddress(new Address("Riga", "Prospect N",100));
        Person p2 = new Person ("Arion", new Address("Berlin", "Friedrichstrasse", 30));
        Address address1 = new Address("Palma de Mallorca", "Barcelona boulevard", 5);
        Person p3 = new Person ("Sergey", address1 );
        Person p4 = new Person ("Alina", new Address("Paris", "Saint Denis", 7));
        Person p5 = new Person ("Luba", new Address("London", "Baker", 21));
        Person p6 = new Person("Misha", new Address("Berlin","Krummestrasse", 12));

        Person[] persons = {p1, p2, p3, p4, p5, p6};

        System.out.println(p1.toString());
        p1.getAddress().setCity("Sigulda");
        System.out.println(p1.toString());
        System.out.println(p1.getAddress().getCity());
        System.out.println(p1.getName() + " livs on the " + p1.getAddress().getStreet());
        findByName(persons,"Kolya");
        System.out.println();

        Person[] cityMembers = Person.listCityMembers(persons, "New York", 5);

        Person.displayPersons(cityMembers);




    }
}

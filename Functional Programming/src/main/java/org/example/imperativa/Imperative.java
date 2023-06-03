package org.example.imperativa;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.example.imperativa.Imperative.Person.Gender.*;

public class Imperative {

    public static void main(String[] args) {
        List<Person> people = List.of(new Person("Gabriel", MALE),
                new Person("Aida", FEMALE),
                new Person("Juan", MALE),
                new Person("Sazuki", MALE));
        List<Person> females = new ArrayList<>();
        //Forma Imperativa
        for (Person person : people) {
            if (FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }
        System.out.println("Forma Imperativa");
        for (Person female : females) {
            if (FEMALE.equals(female.gender)) {
                System.out.println(female);
            }
        }
        //Forma Declarativa
        System.out.println("Forma Declarativa");
        people.stream().filter(person -> FEMALE.equals(person.gender)).toList().forEach(System.out::println);

    }

    static class Person {
        private final String name;
        private final Gender gender;

        enum Gender {
            MALE, FEMALE
        }

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
}

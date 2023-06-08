package org.example.streams;

import java.util.List;
import java.util.stream.Collectors;

import static org.example.streams._Stream.Person.Gender.FEMALE;
import static org.example.streams._Stream.Person.Gender.MALE;


public class _Stream {

    public static void main(String[] args) {
        List<Person> people = List.of(new Person("Gabriel", MALE),
                new Person("Aida", FEMALE),
                new Person("Juan", MALE),
                new Person("Sazuki", MALE));

        people.stream()
                //map will transform the List , converting everyone in genders
                .map(person -> person.gender)
                // then we collect to the set removing duplicates
                .collect(Collectors.toSet())
                //Then we simply print every element in the list
                .forEach(System.out::println);
        System.out.println("-------------------------------------");
        people.stream()
                //map will transform the List , giving us the names
                .map(person -> person.name)
                // then we receive the length of each name in the list
                .mapToInt(name -> name.length())
                //Then we simply print every element in the list
                .forEach(System.out::println);
        System.out.println("-------------------------------------");
        boolean containsOnlyFemales = people.stream()
                //This takes care making an assertion
                .allMatch(person -> FEMALE.equals(person.gender));
        System.out.println("The list contains only Females? " + containsOnlyFemales);
        boolean mayContainOnlyFemales = people.stream()
                .anyMatch(person -> FEMALE.equals(person.gender));
        System.out.println("The list may contains only Females? " + mayContainOnlyFemales);
        boolean containsPreferNotToSay = people.stream()
                .noneMatch(person -> FEMALE.equals(person.gender));
        System.out.println("Does this list contains any prefer not to say?   " + containsPreferNotToSay);

    }

    static class Person {
        private final String name;
        private final Gender gender;

        enum Gender {
            MALE, FEMALE, PREFERNOTTOSAY
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


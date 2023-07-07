package org.example.datastructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WorkingWithMaps {

    public static void main(String[] args) {

        Map<Person, Food> favoriteFoods = new HashMap<>();
        favoriteFoods.put(new Person("John"), new Food("Pizza"));
        //This example was used to show the importance of the Hascode (records don't need hashcode)
        System.out.println(favoriteFoods.get(new Person("John")));
        System.out.println(favoriteFoods.get(new Person("John").hashCode()));
        System.out.println(new Person("John").hashCode());
    }

    public static void mapsPractice() {

        Map<Integer, Person> persons = new HashMap<>();
        persons.put(1, new Person("John"));
        persons.put(2, new Person("Gabriel"));
        persons.put(3, new Person("Aida"));
        System.out.println(persons);
        //The latest insert will override the key in case of using the same Key as it is Unique
        persons.put(3, new Person("Daniel"));
        System.out.println(persons);
        System.out.println(persons.containsKey(2));
        System.out.println(persons.keySet());
        System.out.println(persons.entrySet());

        persons.entrySet().
                forEach(x -> System.out.println(x.getKey() + " - " + x.getValue()));

        persons.remove(2);
        //This is the same as looping with entryset but this is more straightforward and uses a BiConsumer
        System.out.println("list of persons after remove of the second element");
        persons.forEach((key, person) -> {
            System.out.println(key + " - " + person);
        });
    }

    static class Person {
        String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Person person)) return false;

            return Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }

    record Food(String dish) {
    }
}

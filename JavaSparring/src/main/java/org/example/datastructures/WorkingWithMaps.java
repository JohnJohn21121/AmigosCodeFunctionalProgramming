package org.example.datastructures;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {
    public static void main(String[] args) {

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

    record Person(String name) {

    }
}

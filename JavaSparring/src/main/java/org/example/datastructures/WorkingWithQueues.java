package org.example.datastructures;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class WorkingWithQueues {

    public static void main(String[] args) {
        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("John", 24));
        linkedList.add(new Person("Gabriel", 23));
        ListIterator<Person> personListIterator = linkedList.listIterator();
        System.out.println("Regular Order ");
        while (personListIterator.hasNext()) {
            System.out.println(personListIterator.next());
        }
        System.out.println("Backwards ");
        while (personListIterator.hasPrevious()) {
            System.out.println(personListIterator.previous());
        }
        queues();

    }

    public static void queues() {

        Queue<Person> superMarketCustomer = new LinkedList<>();
        superMarketCustomer.add(new Person("John", 24));
        superMarketCustomer.add(new Person("Daniel", 23));
        superMarketCustomer.add(new Person("Aida", 24));

        System.out.println("Queue practice");
        System.out.println(superMarketCustomer.size());
        System.out.println(superMarketCustomer.peek());
        //Poll it´s used for retrieval and removal of the first element
        superMarketCustomer.poll();
        System.out.println(superMarketCustomer.size());
        System.out.println(superMarketCustomer.peek());
        //Pretty similar to add but it is used for cases where we are using a capacity restriction.
        superMarketCustomer.offer(new Person("Gabriel", 24));
    }

    static record Person(String name, int age) {

    }

}

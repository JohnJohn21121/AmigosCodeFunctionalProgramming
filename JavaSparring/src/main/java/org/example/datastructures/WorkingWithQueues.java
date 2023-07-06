package org.example.datastructures;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueues {

    public static void main(String[] args) {

        Queue<Person> superMarketCustomer= new LinkedList<>();
        superMarketCustomer.add(new Person("John", 24));
        superMarketCustomer.add(new Person("Daniel", 23));
        superMarketCustomer.add(new Person("Aida", 24));

        System.out.println(superMarketCustomer.size());
        System.out.println(superMarketCustomer.peek());
        //Poll it´s used for retrieval and removal of the first element
        superMarketCustomer.poll();
        System.out.println(superMarketCustomer.size());
        System.out.println(superMarketCustomer.peek());
        //Pretty similar to add but it is used for cases where we are using a capacity restriction.
        superMarketCustomer.offer(new Person("Gabriel",24));
    }

    static record Person(String name, int age){

    }

}

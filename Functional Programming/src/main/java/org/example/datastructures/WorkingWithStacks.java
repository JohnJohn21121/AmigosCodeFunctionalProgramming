package org.example.datastructures;

import java.util.Stack;

public class WorkingWithStacks {
    public static void main(String[] args) {
        //Stack extends Vector
        Stack<Integer> numbers = new Stack<>();
        //Insert element in the collection
        numbers.push(1);
        numbers.push(3);
        System.out.println("Adding elements to the stack with .push");
        numbers.push(5);
        //See the element at the top of the collection
        System.out.println("Last element of the stack : " + numbers.peek());
        System.out.println("Size of the stack : " + numbers.size());
        numbers.pop();
        System.out.println("Remove an element of the stack with .pop");
        System.out.println("Size of the stack after .pop : " + numbers.size());

        System.out.println("The method .isEmpty returns a boolean");

    }
}

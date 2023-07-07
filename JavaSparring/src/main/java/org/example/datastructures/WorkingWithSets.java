package org.example.datastructures;

import java.util.HashSet;
import java.util.Set;

public class WorkingWithSets {
    public static void main(String[] args) {
        //In case you need order to your set we can use the TreeSet 
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("blue"));
        balls.add(new Ball("yellow"));
        balls.add(new Ball("red"));
        balls.add(new Ball("blue"));
        System.out.println("we have " + balls.size() +" balls");
        //Remember that with Sets order is never guaranteed
        balls.forEach(System.out::println);
        balls.remove(new Ball("yellow"));

        System.out.println("we have " + balls.size() + " after the removal of the Yellow ball.");
        //Remember that with Sets order is never guaranteed
        balls.forEach(System.out::println);


    }

    record Ball(String color) {

    }
}

package org.example;

import org.example.abstractpractice.Cat;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Orugo", 1, "Raza");
        cat.makeNoise();
        System.out.println("Hello world! let me show you my cat he is " + cat.getName() +
                " , and he is " + cat.getAge() + " years old. He loves to eat " + cat.getFoodOfPreference());


        Object value = Optional.ofNullable("Hello").orElseThrow(() -> new IllegalStateException("Yikes "));
        System.out.println(value);

        Optional.ofNullable("johnjohn21121@gmail.com")
                //usage of ifPresentOrelse to properly point that we need to pass as a second action a runnable.
                .ifPresentOrElse(email -> System.out.println("Sending email to " + email), () -> {
                    System.out.println("cannot Send Email");
                });
        System.out.println("-------------------------------------------------------");
        Optional.ofNullable(null)
                //usage of ifPresentOrelse to properly point that we need to pass as a second action a runnable.
                .ifPresentOrElse(email -> System.out.println("Sending email to " + email), () -> {
                    System.out.println("cannot Send Email");
                });

    }
}
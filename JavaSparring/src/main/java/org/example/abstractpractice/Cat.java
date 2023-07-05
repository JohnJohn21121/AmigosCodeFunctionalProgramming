package org.example.abstractpractice;

public class Cat extends Animal implements AnimalBehaviour {

    String foodOfPreference;

    public String getFoodOfPreference() {
        return foodOfPreference;
    }

    public Cat(String name, int age, String foodOfPreference) {
        super(name,age);
        this.foodOfPreference = foodOfPreference;
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }

    @Override
    public void breath() {
        System.out.println("*breathing sound");
    }

    @Override
    public void run() {
        System.out.println("Zoomies");
    }
}

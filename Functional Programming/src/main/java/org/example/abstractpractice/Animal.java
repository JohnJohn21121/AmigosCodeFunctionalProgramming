package org.example.abstractpractice;

public abstract class Animal {
    String name;
    int age;

    public abstract void makeNoise();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

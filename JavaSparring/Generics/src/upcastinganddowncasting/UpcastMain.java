package upcastinganddowncasting;

public class UpcastMain {
    public static void main(String[] args) {

        Animal myAnimal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();
        doAnimalStuff(myAnimal);
        doAnimalStuff(cat);
        doAnimalStuff(dog);
    }

    public static void doAnimalStuff(Animal animal) {
        animal.makeNoise();
    }
}

package optionals;

public class Cat {

    public String name;
    public String Color;

    public Cat(String name, String color) {
        this.name = name;
        Color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return Color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", Color='" + Color + '\'' +
                '}';
    }
}

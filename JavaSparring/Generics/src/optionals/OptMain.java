package optionals;

import javax.swing.text.html.Option;
import java.util.Optional;

public class OptMain {
    public static void main(String[] args) {

        Optional<Cat> gato = findCatByName("orugo");
        gato.map(Cat::getName).orElse("La Negra");

        System.out.println(gato);

    }

    private static Optional<Cat> findCatByName(String name) {
        Cat cat = new Cat(name, "Gris");
        return Optional.ofNullable(cat);
    }

}


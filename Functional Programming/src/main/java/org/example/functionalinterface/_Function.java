package org.example.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {

        int incrementedNumber = increment(2);
        System.out.println(incrementedNumber);

        int incrementedNumber2 = incrementBy1Function.apply(2);
        System.out.println("Resultado con la funcion" + incrementedNumber2);

        //Ejemplo mantenido para mostrar como se pueden encadenar funciones
        int multiply = multiplyBy10Function.apply(incrementedNumber2);
        System.out.println(multiply);

        Function<Integer, Integer> addBy1AndThenMultiplyBy10 = incrementBy1Function.andThen(multiplyBy10Function);
        System.out.println("Resultado con la funcion compuesta: " + addBy1AndThenMultiplyBy10.apply(2));

        System.out.println(incrementBy1andMultiplyFunction.apply(4, 10));

    }

    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

    static BiFunction<Integer, Integer, Integer> incrementBy1andMultiplyFunction =
            (numberToIncrement, numberToMultiply)
                    -> (numberToIncrement + 1) * numberToMultiply;

    //La funcion puede ir dentro de un metodo
    static Function<Integer, Integer> incrementBy1Function = number -> number + 1;

    static int increment(int number) {
        return number + 1;
    }
}

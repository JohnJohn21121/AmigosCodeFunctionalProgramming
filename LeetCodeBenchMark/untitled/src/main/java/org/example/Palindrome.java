package org.example;

import java.util.Map;

public class Palindrome {

    //La idea es tomar los numeros y en caso de reorganizar sus posiciones que se mantenga el mismo numero, ej 101
    //Esto se hace tomando en cuenta que estamos convirtiendo un int en un charArray.
    //posteriormente se va a proceder a iterar sobre el char array
    //Se toma el palindromo como un literal por lo tanto -121 se lee como 121- asi que se puede usar strings
    //Asignamos al temporal el numero de valor en el momento
    // pasamos a comparar el temporal con el numero actual


    public boolean isPalindrome(int x) {

        char[] numberValue = Integer.toString(x).toCharArray();
        String temp = null;
        for (int i = 0; i < numberValue.length; i++){
            if (temp==null) {
                temp = String.valueOf(numberValue[i]);
            }


        }

    }
}

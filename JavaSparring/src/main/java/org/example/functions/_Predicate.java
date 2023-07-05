package org.example.functions;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        //Non-Functional way
        System.out.println("Non-Functional Way");
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("09000773000"));
        System.out.println(isPhoneNumberValid("0900077300"));
        System.out.println("----------------------------");
        isPhoneNumberValidPredicate.test("07300000000");
        isPhoneNumberValidPredicate.test("09000000000");
        isPhoneNumberValidPredicate.test("0700000000");
        System.out.println("Chaining Predicates");
        System.out.println("Correct Format : " + isPhoneNumberValidPredicate.and(containsNumber3).test("07300000000"));
        System.out.println("Incorrect Format but containing 3 : " +
                isPhoneNumberValidPredicate.and(containsNumber3).test("09300000000"));
    }

    static Predicate<String > isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }
    static Predicate<String > containsNumber3 = phoneNumber -> phoneNumber.contains("3");
}

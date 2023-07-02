package org.example.functions.designpatternsfunctional;

import java.time.LocalDate;

import static org.example.functions.designpatternsfunctional.CustomerRegistrationValidator.*;

public class DesignMain {

    public static void main(String[] args) {
        Customer aida = new Customer("Aida",
                "aidita@gmail.com",
                "+54 12345678",
                LocalDate.of(1999, 1, 13));

        Customer gabriel = new Customer("Gabriel",
                "gabrielgmail.com",
                "+58 12345678",
                LocalDate.of(1999, 9, 11));



        System.out.println(new CustomerValidatorService().isValid(aida));

        System.out.println("FUNCTIONS USING COMBINATOR PATTERN BABYYYY");
        CustomerRegistrationValidator.ValidationResult result = isEmailValid().
                and(isPhoneNumberValid()).
                and(isAnAdult()).
                apply(aida);

        System.out.println(result);

        if (result!=ValidationResult.SUCCESS){
            throw new IllegalStateException(result.name());
        }


        System.out.println("FUNCTIONS USING COMBINATOR PATTERN BABYYYY (But now we expect a fail)");
        CustomerRegistrationValidator.ValidationResult resultExpectingFailure = isEmailValid().
                and(isPhoneNumberValid()).
                and(isAnAdult()).
                apply(gabriel);



        System.out.println(resultExpectingFailure);

        if (resultExpectingFailure != ValidationResult.SUCCESS){
            throw new IllegalStateException(resultExpectingFailure.name());
        }
    }


}

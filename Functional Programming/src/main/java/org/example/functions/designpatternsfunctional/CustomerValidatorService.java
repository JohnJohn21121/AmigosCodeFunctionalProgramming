package org.example.functions.designpatternsfunctional;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {


    public boolean isEmailValid(String email) {
        return email.contains("@");
    }

    public boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.contains("+54");
    }

    public boolean isAdult(LocalDate dob) {
        return Period.between(dob, LocalDate.now()).getYears() > 18;
    }

    public boolean isValid(Customer customer){
        return isEmailValid(customer.getEmail())
                && isPhoneNumberValid(customer.getPhoneNumber())
                && isAdult(customer.getDateOfBirth());
    }

}

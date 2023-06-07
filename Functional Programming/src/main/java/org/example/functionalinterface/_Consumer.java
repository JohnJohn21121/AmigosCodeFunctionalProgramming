package org.example.functionalinterface;

import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {

        greetCustomer(new Customer("Carlos", "12345678"));
        greetCustomerByConsumer.accept(new Customer("Juan", "12345678"));
    }

    static Consumer<Customer> greetCustomerByConsumer = customer -> System.out.println("Hello " + customer.getName() +
            " , I hope you are doing fine, is your phone number still being " +
            customer.getCustomerPhone() + "?");

    static void greetCustomer(Customer customer) {
        String stringBuilder = "Hello " + customer.getName() +
                " , I hope you are doing fine, is your phone number still being " +
                customer.getCustomerPhone() + "?";
        System.out.println(stringBuilder);
    }

    static class Customer {
        private final String name, customerPhone;

        Customer(String name, String customerPhone) {
            this.name = name;
            this.customerPhone = customerPhone;
        }

        public String getName() {
            return name;
        }

        public String getCustomerPhone() {
            return customerPhone;
        }


    }
}

package org.example.functions;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {

        greetCustomer(new Customer("Carlos", "12345678"));
        greetCustomerByConsumer.accept(new Customer("Juan", "12345678"));
        greetCustomerByBiConsumer.accept(new Customer("Daniel", "12345678"), false);
    }

    static Consumer<Customer> greetCustomerByConsumer = customer -> System.out.println("Hello " + customer.getName() +
            " , your phone Number has been properly Registered " +
            customer.getCustomerPhone());

    static BiConsumer<Customer, Boolean> greetCustomerByBiConsumer = (customer, showPhoneNumber) -> System.out.println("Hello " + customer.getName() +
            " , your phone Number has been properly Registered " +
            (showPhoneNumber ? customer.getCustomerPhone() : "*****"));

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.getName() +
                " , your phone Number has been properly Registered " +
                customer.getCustomerPhone());
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

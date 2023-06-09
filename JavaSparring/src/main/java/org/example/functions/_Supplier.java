package org.example.functions;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println("Database URL by normal Method " + getDBConnectionUrl());
        System.out.println("Database URL by Supplier " + getDBConnectionUrlSupplier.get());
        System.out.println("Database URL List by Supplier " + getDBConnectionUrlSupplierList.get());
    }


    static String getDBConnectionUrl() {
        return "jdbc://localhost:5432/users";
    }

    static Supplier<String> getDBConnectionUrlSupplier = ()
            -> "jdbc://localhost:5432/users";
    static Supplier<List<String>> getDBConnectionUrlSupplierList = ()
            -> List.of("jdbc://localhost:5432/users",
                       "jdbc://localhost:5432/users/shoppingCart");

}

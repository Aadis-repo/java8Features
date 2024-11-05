package org.example.functional;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());
        System.out.println("using suppliers");
        System.out.println(getDbConnectionUrlSupplier.get());
        System.out.println("list suplier");
        System.out.println(getDbConnectionUrlsSupplier.get());
    }

    static String getDBConnectionUrl(){
        return "jdbc://localhost:5432/users";
    }
    // Supplier is a functional interface which accepts no input and returns an object output,
    // the result has to be specified in the supplier definition
    static Supplier<String> getDbConnectionUrlSupplier = () -> "jdbc://localhost:5432/users";
    static Supplier<List<String>> getDbConnectionUrlsSupplier = () -> List.of("jdbc://localhost:5432/users","jdbc://localhost:5432/customers");
}

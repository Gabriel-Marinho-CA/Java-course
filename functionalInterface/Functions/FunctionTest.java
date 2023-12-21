package nelioAlves.course.functionalInterface.Functions;

import nelioAlves.course.functionalInterface.Utils.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionTest {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.30));
        list.add(new Product("HD", 80.95));

        Function<Product, String> func = p -> p.getName().toUpperCase();

        List<String> names = list.stream()
                .map(func)
                .collect(Collectors.toList());


        List<String> names2 = list.stream()
                .map(new FuncInterface())
                .collect(Collectors.toList());


        names.forEach(System.out::println);
        names2.forEach(System.out::println);
    }
}

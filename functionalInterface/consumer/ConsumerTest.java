package nelioAlves.course.functionalInterface.consumer;

import nelioAlves.course.functionalInterface.Utils.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.30));
        list.add(new Product("HD", 80.95));

        double factor = 1.1;
        Consumer<Product> cons = p -> {
            p.setPrice(p.getPrice() * factor);
        };

        list.forEach(cons);

//        list.forEach(new ProductConsumer());

        list.forEach(System.out::println);
    }
}

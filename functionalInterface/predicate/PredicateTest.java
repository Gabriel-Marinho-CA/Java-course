package nelioAlves.course.functionalInterface.predicate;

import nelioAlves.course.functionalInterface.Utils.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.30));
        list.add(new Product("HD", 80.95));

        double min = 100.0;

//        Predicate<Product> pred = p -> p.getPrice() >= min;

//        list.removeIf(new ProductPredicate());
//        list.removeIf(Product::staticProductPredicate);
        list.removeIf(p -> p.getPrice() >= min);

        for (Product p : list) {
            System.out.println(p);
        }

    }


}

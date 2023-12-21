package nelioAlves.course.functionalInterface.consumer;

import nelioAlves.course.functionalInterface.Utils.Product;
import nelioAlves.course.functionalInterface.predicate.PredicateTest;

import java.util.function.Consumer;

public class ProductConsumer implements Consumer<Product> {
    @Override
    public void accept(Product product) {
        product.setPrice(product.getPrice() * 1.1);
    }
}

package nelioAlves.course.functionalInterface.Functions;

import nelioAlves.course.functionalInterface.Utils.Product;

import java.util.function.Function;

public class FuncInterface implements Function<Product,String> {

    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase() ;
    }

}

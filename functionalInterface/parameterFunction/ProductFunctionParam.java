package nelioAlves.course.functionalInterface.parameterFunction;

import nelioAlves.course.functionalInterface.Utils.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductFunctionParam {
    public double filteredSum(List<Product> list, Predicate<Product> criterea) {
        double sum = 0.0;

        for(Product pdp : list) {
            if(criterea.test(pdp) ) {
                sum += pdp.getPrice();
            }
        }

        return sum;
    }
}

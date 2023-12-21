package nelioAlves.course.functionalInterface.parameterFunction;

import nelioAlves.course.functionalInterface.Utils.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductFunctionParamTest {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.30));
        list.add(new Product("HD", 80.95));

        ProductFunctionParam ps = new ProductFunctionParam();

        double sum = ps.filteredSum(list,p-> p.getName().charAt(0) == 'M');

        System.out.println(sum);
    }
}

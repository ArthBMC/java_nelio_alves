package section18.creatingFunction.model.services;

import section18.creatingFunction.entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    public Double filteredPrice (List<Product> product, Predicate<Product> criteria){
        Double sum = 0.0;
        for (Product p : product){
            if(criteria.test(p)){
                sum += p.getPrice();
            }
        }
        return sum;
    }
}

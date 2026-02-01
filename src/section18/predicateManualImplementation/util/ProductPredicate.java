package section18.predicateManualImplementation.util;

import section18.predicateManualImplementation.entities.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {
    @Override
    public boolean test(Product product) {
        return product.getPrice() >= 100;
    }
}

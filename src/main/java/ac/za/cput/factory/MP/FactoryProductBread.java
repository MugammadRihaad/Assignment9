package ac.za.cput.factory.MP;

import ac.za.cput.domain.MP.ProductBread;

public class FactoryProductBread {
    public static ProductBread getProductBread(String productBreadId, String category, int amount){
        return new ProductBread.Builder()
                .productBreadId(productBreadId)
                .category(category)
                .amount(amount)
                .build();
    }
}

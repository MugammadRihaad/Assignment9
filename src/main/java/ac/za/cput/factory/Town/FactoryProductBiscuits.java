package ac.za.cput.factory.Town;

import ac.za.cput.domain.Town.ProductBiscuits;

public class FactoryProductBiscuits {
    public static ProductBiscuits getProductBiscuits(String productBiscuitsId, String category, int amount){
        return new ProductBiscuits.Builder()
                .productBiscuitsId(productBiscuitsId)
                .category(category)
                .amount(amount)
                .build();
    }
}

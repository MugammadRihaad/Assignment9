package ac.za.cput.factory.Bellville;

import ac.za.cput.domain.Bellville.ProductCakes;

public class FactoryProductCakes {
    public static ProductCakes getProductCakes(String productCakeId, String category,int amount){
        return new ProductCakes.Builder()
                                .productCakeId(productCakeId)
                                .category(category)
                                .amount(amount)
                                .build();
    }
}

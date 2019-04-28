package ac.za.cput.factory.Bellville;

import ac.za.cput.domain.Bellville.BellvilleDelivery;

public class FactoryBellvilleDelivery {
    public static BellvilleDelivery getBellvilleDelivery(String bellDelivId,String bellStockId){
     return new BellvilleDelivery.Builder()
                .bellDeliveId(bellDelivId)
                .bellStockId(bellStockId)
                .build();
    }
}

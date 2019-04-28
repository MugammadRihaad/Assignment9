package ac.za.cput.factory.MP;

import ac.za.cput.domain.MP.MPDelivery;

public class FactoryMPDelivery {
    public static MPDelivery getMPDelivery(String mpDelivId, String mpStockId){
        return new MPDelivery.Builder()
                .mpDeliveId(mpDelivId)
                .mpStockId(mpStockId)
                .build();
    }
}

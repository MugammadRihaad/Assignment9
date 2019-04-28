package ac.za.cput.factory.Town;

import ac.za.cput.domain.Town.TownDelivery;

public class FactoryTownDelivery {
    public static TownDelivery getTownDelivery(String tnDelivId, String tnStockId){
        return new TownDelivery.Builder()
                .tnDeliveId(tnDelivId)
                .tnStockId(tnStockId)
                .build();
    }
}

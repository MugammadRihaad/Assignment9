package ac.za.cput.factory.StockDeliveries;

import ac.za.cput.domain.StockDeliveries.Deliveries;

public class FactoryDeliveries {
    public static Deliveries getDeliveries(String delivId,String delivName,int delivAmount, double delivPriceUnit){
        return new Deliveries.Builder()
                .delivId(delivId)
                .delivName(delivName)
                .delivAmount(delivAmount)
                .delivPriceUnit(delivPriceUnit)
                .build();

    }
}

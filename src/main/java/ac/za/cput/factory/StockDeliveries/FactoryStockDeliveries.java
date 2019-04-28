package ac.za.cput.factory.StockDeliveries;

import ac.za.cput.domain.StockDeliveries.StockDeliveries;

public class FactoryStockDeliveries {
    public static StockDeliveries getStockDeliveries(String delId,String stockdelId,String stockId){
        return new StockDeliveries.Builder()
                    .delId(delId)
                    .stockdelId(stockdelId)
                    .stockId(stockId)
                    .build();
    }
}

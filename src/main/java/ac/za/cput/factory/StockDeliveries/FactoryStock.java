package ac.za.cput.factory.StockDeliveries;


import ac.za.cput.domain.StockDeliveries.Stock;

public class FactoryStock {
    public static Stock getStock(String stockId,String stockCategory,int stockAm,double stockWeight){
        return new Stock.Builder()
                .stockCate(stockCategory)
                .stockAmount(stockAm)
                .stockWeight(stockWeight)
                .stockId(stockId)
                .build();

    }
}

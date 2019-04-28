package ac.za.cput.domain.StockDeliveries;

public class StockDeliveries {
    private String delId,stockdelId,stockId;

    private StockDeliveries(){}

    private StockDeliveries(Builder builder) {
        this.delId = builder.delId;
        this.stockdelId = builder.stockdelId;
        this.stockId=builder.stockId;

    }

    public String getDelId() {
        return delId;
    }

    public String geStockdelId() {
        return stockdelId;
    }

    public String getStockId(){
        return stockId;
    }
    public static class Builder{

        private String delId, stockdelId,stockId;


        public Builder delId(String delId) {
            this.delId = delId;
            return this;
        }

        public Builder stockdelId(String stockdelId) {
            this.stockdelId = stockdelId;
            return this;
        }

        public Builder stockId(String stockId) {
            this.stockId =stockId;
            return this;
        }


        public StockDeliveries build() {
            return new StockDeliveries(this);
        }

    }

    @Override
    public String toString() {
        return "Stock Deliveries{" +
                " Delivery Id='" + delId + '\'' +
                ",Stock Delivery Id='" + stockdelId + '\'' +
                ", Stock Id='" + stockId + '\'' +
                '}';
    }

}

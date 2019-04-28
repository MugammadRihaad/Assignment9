package ac.za.cput.domain.StockDeliveries;

public class Stock {
    private String stockId,stockCate;
    private int stockAmount;
    private double stockWeight;

    private Stock(){}

    private Stock(Builder builder) {
        this.stockId = builder.stockId;
        this.stockCate = builder.stockCate;
        this.stockAmount=builder.stockAmount;
        this.stockWeight=builder.stockWeight;
    }

    public String getStockId() {
        return stockId;
    }

    public String getStockCate() {
        return stockCate;
    }

    public int getStockAmount(){
        return stockAmount;
    }

    public double getStockWeight(){
        return stockWeight;
    }

    public static class Builder{

        private String stockId, stockCate;
        private   int   stockAmount;
        private double stockWeight;

        public Builder stockId(String stockId) {
            this.stockId = stockId;
            return this;
        }

        public Builder stockCate(String stockCate) {
            this.stockCate = stockCate;
            return this;
        }

        public Builder stockAmount(int stockAmount){
            this.stockAmount =stockAmount;
            return this;
        }

        public Builder stockWeight(double stockWeight) {
            this.stockWeight =stockWeight;
            return this;
        }

        public Stock build() {
            return new Stock(this);
        }

    }

    @Override
    public String toString() {
        return "Stock{" +
                "Stock Id='" + stockId + '\'' +
                ", Stock Category ='" + stockCate + '\'' +
                ", Stock amount='" + stockAmount + '\'' +
                ", Stock weight='" + stockWeight + '\'' +
                '}';
    }
}

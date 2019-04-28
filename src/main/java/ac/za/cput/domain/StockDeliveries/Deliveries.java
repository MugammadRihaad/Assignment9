package ac.za.cput.domain.StockDeliveries;

public class Deliveries {
    private String delivId,delivName;
    private int delivAmount;
    private double delivPriceUnit;

    private Deliveries(){}

    private Deliveries(Builder builder) {
        this.delivId = builder.delivId;
        this.delivName = builder.delivName;
        this.delivAmount=builder.delivAmount;
        this.delivPriceUnit=builder.delivPriceUnit;
    }

    public String getDelivId() {
        return delivId;
    }

    public String getDelivName() {
        return delivName;
    }

    public int getDelivAmount(){
        return delivAmount;
    }
    public double getDelivPriceUnit(){
        return delivPriceUnit;
    }

    public static class Builder{

        private String delivId, delivName;
        private int delivAmount;
        private double delivPriceUnit;


        public Builder delivId(String delivId) {
            this.delivId = delivId;
            return this;
        }

        public Builder delivName(String delivName) {
            this.delivName = delivName;
            return this;
        }

        public Builder delivAmount(int delivAmount) {
            this.delivAmount =delivAmount;
            return this;
        }

        public Builder delivPriceUnit(double delivPriceUnit) {
            this.delivPriceUnit =delivPriceUnit;
            return this;
        }

        public Deliveries build() {
            return new Deliveries(this);
        }

    }

    @Override
    public String toString() {
        return "Deliveries{" +
                " Delivery Id='" + delivId + '\'' +
                ",Delivery Name='" + delivName + '\'' +
                ", Delivery Amount '" + delivAmount + '\'' +
                ",Delivery Price Unit'" + delivPriceUnit + '\'' +
                '}';
    }
}

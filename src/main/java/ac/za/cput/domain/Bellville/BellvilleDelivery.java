package ac.za.cput.domain.Bellville;

public class BellvilleDelivery {
    private String bellDeliveId,bellStockId;

    private BellvilleDelivery(){}

    private BellvilleDelivery(Builder builder) {
        this.bellDeliveId = builder.bellDeliveId;
        this.bellStockId = builder.bellStockId;

    }

    public String getBellDeliveId() {
        return bellDeliveId;
    }

    public String getBellStockId() {
        return bellStockId;
    }



    public static class Builder{

        private String bellDeliveId, bellStockId;


        public Builder bellDeliveId(String bellDeliveId) {
            this.bellDeliveId = bellDeliveId;
            return this;
        }

        public Builder bellStockId(String bellStockId) {
            this.bellStockId = bellStockId;
            return this;
        }



        public BellvilleDelivery build() {
            return new BellvilleDelivery(this);
        }

    }

    @Override
    public String toString() {
        return "Bellville Delivery{" +
                " Bellville Delivery Id='" + bellDeliveId + '\'' +
                ",Bellville Stock Id='" + bellStockId + '\'' +
                '}';
    }
}

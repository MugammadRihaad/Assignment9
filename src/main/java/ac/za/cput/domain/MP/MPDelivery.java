package ac.za.cput.domain.MP;

public class MPDelivery {
    private String mpDeliveId,mpStockId;

    private MPDelivery(){}

    private MPDelivery(Builder builder) {
        this.mpDeliveId = builder.mpDeliveId;
        this.mpStockId = builder.mpStockId;

    }

    public String getMpDeliveId() {
        return mpDeliveId;
    }

    public String getMpStockId() {
        return mpStockId;
    }



    public static class Builder{

        private String mpDeliveId, mpStockId;


        public Builder mpDeliveId(String mpDeliveId) {
            this.mpDeliveId = mpDeliveId;
            return this;
        }

        public Builder mpStockId(String mpStockId) {
            this.mpStockId = mpStockId;
            return this;
        }



        public MPDelivery build() {
            return new MPDelivery(this);
        }

    }

    @Override
    public String toString() {
        return "Mitchells Plain Delivery{" +
                " Mitchells Plain Delivery Id='" + mpDeliveId + '\'' +
                ",Mitchells Plain Stock Id='" + mpStockId + '\'' +
                '}';
    }
}

package ac.za.cput.domain.Town;

public class TownDelivery {
    private String tnDeliveId,tnStockId;

    private TownDelivery(){}

    private TownDelivery(Builder builder) {
        this.tnDeliveId = builder.tnDeliveId;
        this.tnStockId = builder.tnStockId;

    }

    public String getTnDeliveId() {
        return tnDeliveId;
    }

    public String getTnStockId() {
        return tnStockId;
    }



    public static class Builder{

        private String tnDeliveId, tnStockId;


        public Builder tnDeliveId(String tnDeliveId) {
            this.tnDeliveId = tnDeliveId;
            return this;
        }

        public Builder tnStockId(String tnStockId) {
            this.tnStockId = tnStockId;
            return this;
        }



        public TownDelivery build() {
            return new TownDelivery(this);
        }

    }

    @Override
    public String toString() {
        return "Mitchells Plain Delivery{" +
                " Mitchells Plain Delivery Id='" + tnDeliveId + '\'' +
                ",Mitchells Plain Stock Id='" + tnStockId + '\'' +
                '}';
    }
}

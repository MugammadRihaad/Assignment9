package ac.za.cput.domain.Bellville;

public class BellvilleStaff {
    private String bellStaffId,bellAccountId,bellDelivId,bellBakerId;

    private BellvilleStaff(){}

    private BellvilleStaff(Builder builder) {
        this.bellStaffId = builder.bellStaffId;
        this.bellAccountId = builder.bellAccountId;
        this.bellDelivId=builder.bellDelivId;
        this.bellBakerId=builder.bellBakerId;
    }

    public String getBellStaffId() {
        return bellStaffId;
    }

    public String getBellAccountId() {
        return bellAccountId;
    }

    public String getBellDelivId(){
        return bellDelivId;
    }

    public String bellBakerId(){
        return bellBakerId;
    }

    public static class Builder{

        private String bellStaffId, bellAccountId,bellDelivId,bellBakerId;


        public Builder bellStaffId(String bellStaffId) {
            this.bellStaffId = bellStaffId;
            return this;
        }

        public Builder bellAccountId(String bellAccountId) {
            this.bellAccountId = bellAccountId;
            return this;
        }

        public Builder bellBakerId(String bellBakerId) {
            this.bellBakerId =bellBakerId;
            return this;
        }
        public Builder bellDelivId(String bellDelivId) {
            this.bellDelivId =bellDelivId;
            return this;
        }


        public BellvilleStaff build() {
            return new BellvilleStaff(this);
        }

    }

    @Override
    public String toString() {
        return "Bellville Staff{" +
                " Bellville Staff Id='" + bellStaffId + '\'' +
                ",Bellville Accountant Id='" + bellAccountId + '\'' +
                ", Bellville Delivery Id='" + bellDelivId + '\'' +
                ", Bellville Baker Id='" + bellBakerId + '\'' +
                '}';
    }

}

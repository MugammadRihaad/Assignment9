package ac.za.cput.domain.MP;

public class MPStaff {
    private String mpStaffId,mpAccountId,mpDelivId,mpBakerId;

    private MPStaff(){}

    private MPStaff(Builder builder) {
        this.mpStaffId = builder.mpStaffId;
        this.mpAccountId = builder.mpAccountId;
        this.mpDelivId=builder.mpDelivId;
        this.mpBakerId=builder.mpBakerId;
    }

    public String getMpStaffId() {
        return mpStaffId;
    }

    public String getMpAccountId() {
        return mpAccountId;
    }

    public String getMpDelivId(){
        return mpDelivId;
    }

    public String getMpBakerId(){
        return mpBakerId;
    }

    public static class Builder{

        private String mpStaffId, mpAccountId,mpDelivId,mpBakerId;


        public Builder mpStaffId(String mpStaffId) {
            this.mpStaffId = mpStaffId;
            return this;
        }

        public Builder mpAccountId(String mpAccountId) {
            this.mpAccountId = mpAccountId;
            return this;
        }

        public Builder mpDelivId(String mpDelivId) {
            this.mpDelivId =mpDelivId;
            return this;
        }
        public Builder mpBakerId(String mpBakerId) {
            this.mpBakerId =mpBakerId;
            return this;
        }


        public MPStaff build() {
            return new MPStaff(this);
        }

    }

    @Override
    public String toString() {
        return "Bellville Staff{" +
                " Bellville Staff Id='" + mpStaffId + '\'' +
                ",Bellville Accountant Id='" + mpAccountId + '\'' +
                ", Bellville Delivery Id='" + mpDelivId + '\'' +
                ", Bellville Baker Id='" + mpBakerId + '\'' +
                '}';
    }

}

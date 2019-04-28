package ac.za.cput.domain.Bellville;

public class BellvilleAccountant {
    private String bellAccountId,bellLedgerId,bellGeneralLId,
            bellBusinessLId,bellCreditorsLId;

    private BellvilleAccountant(){}

    private BellvilleAccountant(Builder builder) {
        this.bellAccountId=builder.bellAccountId;
        this.bellLedgerId = builder.bellLedgerId;
        this.bellGeneralLId = builder.bellGeneralLId;
        this.bellBusinessLId=builder.bellBusinessLId;
        this.bellCreditorsLId=builder.bellCreditorsLId;
    }

    public String getBellAccountId(){
        return bellAccountId;
    }

    public String getBellLedgerId() {
        return bellLedgerId;
    }

    public String getBellGeneralLId() {
        return bellGeneralLId;
    }

    public String getBellBusinessLId(){
        return bellBusinessLId;
    }
    public String getBellCreditorsLId(){
        return bellCreditorsLId;
    }

    public static class Builder{

        private String bellAccountId,bellLedgerId, bellGeneralLId,bellBusinessLId,bellCreditorsLId;


        public Builder bellAccountId(String bellAccountId) {
            this.bellAccountId = bellAccountId;
            return this;
        }

        public Builder bellLedgerId(String bellLedgerId) {
            this.bellLedgerId = bellLedgerId;
            return this;
        }

        public Builder bellGeneralLId(String bellGeneralLId) {
            this.bellGeneralLId = bellGeneralLId;
            return this;
        }

        public Builder bellBusinessLId(String bellBusinessLId) {
            this.bellBusinessLId =bellBusinessLId;
            return this;
        }

        public Builder bellCreditorsLId(String bellCreditorsLId) {
            this.bellCreditorsLId =bellCreditorsLId;
            return this;
        }

        public BellvilleAccountant build() {
            return new BellvilleAccountant(this);
        }

    }

    @Override
    public String toString() {
        return "Bellville Accountant{" +
                " Bellville Accountant Id='" + bellAccountId + '\'' +
                " Bellville Ledger Id='" + bellLedgerId + '\'' +
                ",Bellville General Ledger Id='" + bellGeneralLId + '\'' +
                ",Bellville Business Ledger Id='" + bellBusinessLId + '\'' +
                ",Bellville  Creditors Ledger Id'" + bellCreditorsLId + '\'' +
                '}';
    }
}

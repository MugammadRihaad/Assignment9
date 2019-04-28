package ac.za.cput.domain.Ledger;

public class BusinessLedger {
    private String businessLId,custName;
    private double custAmountOwed;

    private BusinessLedger(){}

    private BusinessLedger(Builder builder) {
        this.businessLId = builder.businessLId;
        this.custName = builder.custName;
        this.custAmountOwed=builder.custAmountOwed;
    }

    public String getBusniessLId() {
        return businessLId;
    }

    public String getCustName() {
        return custName;
    }

    public double getCustamountOwed(){
        return custAmountOwed;
    }

    public static class Builder{

        private String businessLId, custName;
        private double custAmountOwed;

        public Builder businessLId(String businessLId) {
            this.businessLId = businessLId;
            return this;
        }

        public Builder custName(String custName) {
            this.custName = custName;
            return this;
        }

        public Builder custAmountOwed(double custAmountOwed) {
            this.custAmountOwed =custAmountOwed;
            return this;
        }

        public BusinessLedger build() {
            return new BusinessLedger(this);
        }

    }

    @Override
    public String toString() {
        return "BusinessLedger{" +
                "Business Ledger Id='" + businessLId + '\'' +
                ", Customer Name='" + custName + '\'' +
                ",Customer Total amount Owed='" + custAmountOwed + '\'' +
                '}';
    }
}

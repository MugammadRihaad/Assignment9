package ac.za.cput.domain.Ledger;

public class CreditorsLedger {
    private String creditorsLId,supplierName;
    private double suppAmountOwed;

    private CreditorsLedger(){}

    private CreditorsLedger(Builder builder) {
        this.creditorsLId = builder.creditorsLId;
        this.supplierName = builder.supplierName;
        this.suppAmountOwed=builder.suppAmountOwed;
    }

    public String getCreditorsLId() {
        return creditorsLId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public double getSuppAmountOwed(){
        return suppAmountOwed;
    }

    public static class Builder{

        private String creditorsLId, supplierName;
        private double suppAmountOwed;

        public Builder creditorsLId(String creditorsLId) {
            this.creditorsLId = creditorsLId;
            return this;
        }

        public Builder supplierName(String supplierName) {
            this.supplierName = supplierName;
            return this;
        }

        public Builder suppAmountOwed(double suppAmountOwed) {
            this.suppAmountOwed =suppAmountOwed;
            return this;
        }

        public CreditorsLedger build() {
            return new CreditorsLedger(this);
        }

    }

    @Override
    public String toString() {
        return "CreditorsLedger{" +
                "Creditors Ledger Id='" + creditorsLId + '\'' +
                ", Supplier Name='" + supplierName + '\'' +
                ",Supplier Total amount Owed='" + suppAmountOwed + '\'' +
                '}';
    }
}

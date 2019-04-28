package ac.za.cput.domain.Town;

public class TownAccountant {
    private String tnAccountId,tnLedgerId,tnGeneralLId,
            tnBusinessLId,tnCreditorsLId;

    private TownAccountant(){}

    private TownAccountant(Builder builder) {
        this.tnAccountId=builder.tnAccountId;
        this.tnLedgerId = builder.tnLedgerId;
        this.tnGeneralLId = builder.tnGeneralLId;
        this.tnBusinessLId=builder.tnBusinessLId;
        this.tnCreditorsLId=builder.tnCreditorsLId;
    }

    public String getTnAccountId(){
        return tnAccountId;
    }

    public String getTnLedgerId() {
        return tnLedgerId;
    }

    public String getTnGeneralLId() {
        return tnGeneralLId;
    }

    public String getTnBusinessLId(){
        return tnBusinessLId;
    }
    public String getTnCreditorsLId(){
        return tnCreditorsLId;
    }

    public static class Builder{

        private String tnAccountId,tnLedgerId, tnGeneralLId,tnBusinessLId,tnCreditorsLId;


        public Builder tnAccountId(String tnAccountId) {
            this.tnAccountId = tnAccountId;
            return this;
        }

        public Builder tnLedgerId(String tnLedgerId) {
            this.tnLedgerId = tnLedgerId;
            return this;
        }

        public Builder tnGeneralLId(String tnGeneralLId) {
            this.tnGeneralLId = tnGeneralLId;
            return this;
        }

        public Builder tnBusinessLId(String tnBusinessLId) {
            this.tnBusinessLId =tnBusinessLId;
            return this;
        }

        public Builder tnCreditorsLId(String tnCreditorsLId) {
            this.tnCreditorsLId =tnCreditorsLId;
            return this;
        }

        public TownAccountant build() {
            return new TownAccountant(this);
        }

    }

    @Override
    public String toString() {
        return "Town Accountant{" +
                " Town Accountant Id='" + tnAccountId + '\'' +
                " Town Ledger Id='" + tnLedgerId + '\'' +
                ",Town General Ledger Id='" + tnGeneralLId + '\'' +
                ",Town Business Ledger Id='" + tnBusinessLId + '\'' +
                ",Town  Creditors Ledger Id'" + tnCreditorsLId + '\'' +
                '}';
    }
}

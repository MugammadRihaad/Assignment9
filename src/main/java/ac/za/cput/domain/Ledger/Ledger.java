package ac.za.cput.domain.Ledger;

public class Ledger {
   private String ledgerId,generalLId,businessLId,creditorsLId;

    private Ledger(){}

    private Ledger(Builder builder) {
        this.ledgerId = builder.ledgerId;
        this.generalLId = builder.generalLId;
        this.businessLId=builder.businessLId;
        this.creditorsLId=builder.creditorsLId;
    }

    public String getLedgerId() {
        return ledgerId;
    }

    public String getGeneralLId() {
        return generalLId;
    }

    public String getBusinessLId(){
        return businessLId;
    }
    public String getCreditorsLId(){
        return creditorsLId;
    }

    public static class Builder{

        private String ledgerId, generalLId,businessLId,creditorsLId;


        public Builder ledgerId(String ledgerId) {
            this.ledgerId = ledgerId;
            return this;
        }

        public Builder generalLId(String generalLId) {
            this.generalLId = generalLId;
            return this;
        }

        public Builder businessLId(String businessLId) {
            this.businessLId =businessLId;
            return this;
        }

        public Builder creditorsLId(String creditorsLId) {
            this.creditorsLId =creditorsLId;
            return this;
        }

        public Ledger build() {
            return new Ledger(this);
        }

    }

    @Override
    public String toString() {
        return "Ledger{" +
                " Ledger Id='" + ledgerId + '\'' +
                ",General Ledger Id='" + generalLId + '\'' +
                ", Business Ledger Id='" + businessLId + '\'' +
                ",Creditors Ledger Id'" + creditorsLId + '\'' +
                '}';
    }
}

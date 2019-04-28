package ac.za.cput.domain.Town;

public class TownBaker {

    private String tnBakerId,tnBakerName;
    private double tnBakerSalary;


    private TownBaker(){}

    private TownBaker(Builder builder) {
        this.tnBakerId = builder.tnBakerId;
        this.tnBakerName = builder.tnBakerName;
        this.tnBakerSalary=builder.tnBakerSalary;

    }

    public String getTnBakerId() {
        return tnBakerId;
    }

    public String getTnBakerName() {
        return tnBakerName;
    }

    public double getTnBakerSalary(){
        return tnBakerSalary;
    }
    public static class Builder{

        private String tnBakerId, tnBakerName;
        private double tnBakerSalary;


        public Builder tnBakerId(String tnBakerId) {
            this.tnBakerId = tnBakerId;
            return this;
        }

        public Builder tnBakerName(String tnBakerName) {
            this.tnBakerName = tnBakerName;
            return this;
        }

        public Builder tnBakerSalary(double tnBakerSalary) {
            this.tnBakerSalary =tnBakerSalary;
            return this;
        }


        public TownBaker build() {
            return new TownBaker(this);
        }

    }

    @Override
    public String toString() {
        return "Town Baker{" +
                " Town Id='" + tnBakerId + '\'' +
                ", Town Name='" + tnBakerName + '\'' +
                ",  Town Salary='" + tnBakerSalary + '\'' +
                '}';
    }
}

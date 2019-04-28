package ac.za.cput.domain.Bellville;

public class bellvilleBaker {
    private String bellBakerId,bellBakerName;
    private double bellBakerSalary;


    private bellvilleBaker(){}

    private bellvilleBaker(Builder builder) {
        this.bellBakerId = builder.bellBakerId;
        this.bellBakerName = builder.bellBakerName;
        this.bellBakerSalary=builder.bellBakerSalary;

    }

    public String getBellBakerId() {
        return bellBakerId;
    }

    public String getBellBakerName() {
        return bellBakerName;
    }

    public double getBellBakerSalary(){
        return bellBakerSalary;
    }
    public static class Builder{

        private String bellBakerId, bellBakerName;
        private double bellBakerSalary;


        public Builder bellBakerId(String bellBakerId) {
            this.bellBakerId = bellBakerId;
            return this;
        }

        public Builder bellBakerName(String bellBakerName) {
            this.bellBakerName = bellBakerName;
            return this;
        }

        public Builder bellBakerSalary(double bellBakerSalary) {
            this.bellBakerSalary =bellBakerSalary;
            return this;
        }


        public bellvilleBaker build() {
            return new bellvilleBaker(this);
        }

    }

    @Override
    public String toString() {
        return "bellville Baker{" +
                " Bellville Baker Id='" + bellBakerId + '\'' +
                ", Bellville Baker Name='" + bellBakerName + '\'' +
                ", Bellville Baker Salary='" + bellBakerSalary + '\'' +
                '}';
    }

}

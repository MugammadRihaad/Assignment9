package ac.za.cput.domain.Bellville;

public class BellvilleBranch {
    private String bellBrId,bellStaffId;


    private BellvilleBranch(){}

    private BellvilleBranch(Builder builder) {
        this.bellBrId = builder.bellBrId;
        this.bellStaffId = builder.bellStaffId;

    }

    public String getBellBrId() {
        return bellBrId;
    }

    public String getBellStaffId() {
        return bellStaffId;
    }



    public static class Builder{

        private String bellBrId, bellStaffId;


        public Builder bellBrId(String bellBrId) {
            this.bellBrId = bellBrId;
            return this;
        }

        public Builder bellStaffId(String bellStaffId) {
            this.bellStaffId = bellStaffId;
            return this;
        }



        public BellvilleBranch build() {
            return new BellvilleBranch(this);
        }

    }

    @Override
    public String toString() {
        return "Bellville Branch{" +
                "Bellville Branch Id='" + bellBrId + '\'' +
                ", Bellville Staff Id='" + bellStaffId + '\'' +

                '}';
    }
}

package ac.za.cput.domain.MP;

public class MPBranch {
    private String mpBrId,mpStaffId;


    private MPBranch(){}

    private MPBranch(Builder builder) {
        this.mpBrId = builder.mpBrId;
        this.mpStaffId = builder.mpStaffId;

    }

    public String getMpBrId() {
        return mpBrId;
    }

    public String getMpStaffId() {
        return mpStaffId;
    }



    public static class Builder{

        private String mpBrId, mpStaffId;


        public Builder mpBrId(String mpBrId) {
            this.mpBrId = mpBrId;
            return this;
        }

        public Builder mpStaffId(String mpStaffId) {
            this.mpStaffId = mpStaffId;
            return this;
        }



        public MPBranch build() {
            return new MPBranch(this);
        }

    }

    @Override
    public String toString() {
        return "Mitchells Plain Branch{" +
                "Mitchells Plain Branch Id='" + mpBrId + '\'' +
                ", MitchellsPlain Staff Id='" + mpStaffId + '\'' +

                '}';
    }
}

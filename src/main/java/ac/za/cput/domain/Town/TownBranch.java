package ac.za.cput.domain.Town;

public class TownBranch {
    private String tnBrId,tnStaffId;


    private TownBranch(){}

    private TownBranch(Builder builder) {
        this.tnBrId = builder.tnBrId;
        this.tnStaffId = builder.tnStaffId;

    }

    public String getTnBrId() {
        return tnBrId;
    }

    public String getTnStaffId() {
        return tnStaffId;
    }



    public static class Builder{

        private String tnBrId, tnStaffId;


        public Builder tnBrId(String tnBrId) {
            this.tnBrId = tnBrId;
            return this;
        }

        public Builder tnStaffId(String tnStaffId) {
            this.tnStaffId = tnStaffId;
            return this;
        }



        public TownBranch build() {
            return new TownBranch(this);
        }

    }

    @Override
    public String toString() {
        return "Bellville Branch{" +
                "Bellville Branch Id='" + tnBrId + '\'' +
                ", Bellville Staff Id='" + tnStaffId + '\'' +

                '}';
    }
}

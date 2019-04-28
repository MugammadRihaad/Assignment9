package ac.za.cput.domain;

public class HeadOffice {
    private String officeId,bellvilleBrId,townBrId,
            mpBrId;

    private HeadOffice(){}

    private HeadOffice(Builder builder) {
        this.officeId=builder.officeId;
        this.bellvilleBrId = builder.bellvilleBrId;
        this.townBrId = builder.townBrId;
        this.mpBrId=builder.mpBrId;

    }

    public String getOfficeId(){
        return officeId;
    }

    public String getBellvilleBrId() {
        return bellvilleBrId;
    }

    public String getTownBrId() {
        return townBrId;
    }

    public String getMpBrId(){
        return mpBrId;
    }


    public static class Builder{

        private String officeId,bellvilleBrId, townBrId,mpBrId;


        public Builder officeId(String officeId) {
            this.officeId = officeId;
            return this;
        }

        public Builder bellvilleBrId(String bellvilleBrId) {
            this.bellvilleBrId = bellvilleBrId;
            return this;
        }

        public Builder townBrId(String townBrId) {
            this.townBrId = townBrId;
            return this;
        }

        public Builder mpBrId(String mpBrId) {
            this.mpBrId =mpBrId;
            return this;
        }


        public HeadOffice build() {
            return new HeadOffice(this);
        }

    }

    @Override
    public String toString() {
        return "Head Office {" +
                " Head Office Id='" + officeId + '\'' +
                " Bellville Branch Id='" + bellvilleBrId + '\'' +
                ",Town Branch Id='" + townBrId + '\'' +
                ",Mitchells Plain  Branch Id='" + mpBrId + '\'' +

                '}';
    }
}

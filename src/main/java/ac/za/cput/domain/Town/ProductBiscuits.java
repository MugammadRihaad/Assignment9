package ac.za.cput.domain.Town;

public class ProductBiscuits {
    private String productBiscuitsId,category;
    private int amount;


    private ProductBiscuits(){}

    private ProductBiscuits(Builder builder) {
        this.productBiscuitsId = builder.productBiscuitsId;
        this.category = builder.category;
        this.amount=builder.amount;

    }

    public String getProductBiscuitsId() {
        return productBiscuitsId;
    }

    public String getCategory() {
        return category;
    }

    public int getAmount() {
        return amount;
    }



    public static class Builder{

        private String productBiscuitsId, category;
        private int amount;


        public Builder productBiscuitsId(String productBiscuitsId) {
            this.productBiscuitsId = productBiscuitsId;
            return this;
        }

        public Builder category(String category) {
            this.category = category;
            return this;
        }

        public Builder amount(int amount){
            this.amount=amount;
            return this;
        }



        public ProductBiscuits build() {
            return new ProductBiscuits(this);
        }

    }

    @Override
    public String toString() {
        return " Biscuits Product{" +
                "Biscuits product Id='" + productBiscuitsId + '\'' +
                ", Biscuits Category ='" + category + '\'' +
                ", Biscuits Amount Id='" + amount + '\'' +

                '}';
    }
}

package ac.za.cput.domain.MP;

public class ProductBread {
    private String productBreadId,category;
    private int amount;


    private ProductBread(){}

    private ProductBread(Builder builder) {
        this.productBreadId = builder.productBreadId;
        this.category = builder.category;
        this.amount=builder.amount;

    }

    public String getProductBreadId() {
        return productBreadId;
    }

    public String getCategory() {
        return category;
    }

    public int getAmount() {
        return amount;
    }



    public static class Builder{

        private String productBreadId, category;
        private int amount;


        public Builder productBreadId(String productBreadId) {
            this.productBreadId = productBreadId;
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



        public ProductBread build() {
            return new ProductBread(this);
        }

    }

    @Override
    public String toString() {
        return " Bread Product{" +
                "Bread product Id='" + productBreadId + '\'' +
                ", Bread Category ='" + category + '\'' +
                ", Bread Amount Id='" + amount + '\'' +

                '}';
    }
}

package ac.za.cput.domain.Bellville;

public class ProductCakes {
    private String productCakeId,category;
    private int amount;


    private ProductCakes(){}

    private ProductCakes(Builder builder) {
        this.productCakeId = builder.productCakeId;
        this.category = builder.category;
        this.amount=builder.amount;

    }

    public String getProductCakeId() {
        return productCakeId;
    }

    public String getCategory() {
        return category;
    }

    public int getAmount() {
        return amount;
    }



    public static class Builder{

        private String productCakeId, category;
        private int amount;


        public Builder productCakeId(String productCakeId) {
            this.productCakeId = productCakeId;
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



        public ProductCakes build() {
            return new ProductCakes(this);
        }

    }

    @Override
    public String toString() {
        return " Cake Product{" +
                "Cake product Id='" + productCakeId + '\'' +
                ", Cake Category ='" + category + '\'' +
                ", Cake Amount Id='" + amount + '\'' +

                '}';
    }
}

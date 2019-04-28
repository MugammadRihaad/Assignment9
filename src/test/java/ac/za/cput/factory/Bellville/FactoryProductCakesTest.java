package ac.za.cput.factory.Bellville;

import ac.za.cput.domain.Bellville.ProductCakes;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactoryProductCakesTest {

    @Test
    public void getProductCakes() {
        String productCakeId="pc302";
        String category="Chocolate";
        int amount=200;

        ProductCakes hd=FactoryProductCakes.getProductCakes(productCakeId,category,amount);
        System.out.println(hd);
        Assert.assertNotNull(hd.getProductCakeId()+"\n"+hd.getCategory()+"\n"+hd.getAmount());
    }
}
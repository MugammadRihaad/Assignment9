package ac.za.cput.factory.Town;

import ac.za.cput.domain.Town.ProductBiscuits;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactoryProductBiscuitsTest {

    @Test
    public void getProductBiscuits() {

        String productCBiscuitsId="pc32";
        String category="Chocolate";
        int amount=200;

        ProductBiscuits hd=FactoryProductBiscuits.getProductBiscuits(productCBiscuitsId,category,amount);
        System.out.println(hd);
        Assert.assertNotNull(hd.getProductBiscuitsId()+"\n"+hd.getCategory()+"\n"+hd.getAmount());
    }
}
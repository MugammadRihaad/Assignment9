package ac.za.cput.factory.MP;

import ac.za.cput.domain.MP.ProductBread;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactoryProductBreadTest {

    @Test
    public void getProductBread() {
        String productBreadId="pc02";
        String category="Burdger Rools";
        int amount=100;

        ProductBread hd=FactoryProductBread.getProductBread(productBreadId,category,amount);
        System.out.println(hd);
        Assert.assertNotNull(hd.getProductBreadId()+"\n"+hd.getCategory()+"\n"+hd.getAmount());
    }
}
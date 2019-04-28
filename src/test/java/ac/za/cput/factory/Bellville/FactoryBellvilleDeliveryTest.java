package ac.za.cput.factory.Bellville;

import ac.za.cput.domain.Bellville.BellvilleDelivery;
import ac.za.cput.factory.StockDeliveries.FactoryDeliveries;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactoryBellvilleDeliveryTest {

    @Test
    public void getBellvilleDelivery() {
        String bellDelivId="bd904";
        String bellStockId="bs593";

        BellvilleDelivery hd= FactoryBellvilleDelivery.getBellvilleDelivery(bellDelivId,bellStockId);
        System.out.println(hd);
        Assert.assertNotNull(hd.getBellDeliveId()+"\n"+hd.getBellStockId());
    }
}
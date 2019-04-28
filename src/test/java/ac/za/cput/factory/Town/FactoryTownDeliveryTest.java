package ac.za.cput.factory.Town;

import ac.za.cput.domain.Town.TownDelivery;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactoryTownDeliveryTest {

    @Test
    public void getTownDelivery() {
        String tnDelivId="bd904";
        String tnStockId="bs593";

        TownDelivery hd= FactoryTownDelivery.getTownDelivery(tnDelivId,tnStockId);
        System.out.println(hd);
        Assert.assertNotNull(hd.getTnDeliveId()+"\n"+hd.getTnStockId());
    }
}
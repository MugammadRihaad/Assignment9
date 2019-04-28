package ac.za.cput.factory.MP;

import ac.za.cput.domain.MP.MPDelivery;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactoryMPDeliveryTest {

    @Test
    public void getMPDelivery() {
        String mpDelivId="bd904";
        String mpStockId="bs593";

        MPDelivery hd= FactoryMPDelivery.getMPDelivery(mpDelivId,mpStockId);
        System.out.println(hd);
        Assert.assertNotNull(hd.getMpDeliveId()+"\n"+hd.getMpStockId());
    }
}
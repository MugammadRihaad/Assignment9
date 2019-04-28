package ac.za.cput.factory.Bellville;

import ac.za.cput.domain.Bellville.BellvilleStaff;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactoryBellvilleStaffTest {

    @Test
    public void getBellvilleStaff() {
        String bellStaffId="bs2345";
        String bellAccountID="ba234";
         String bellDelivId="bd2345";
        String bellBakerId="bb2134";

        BellvilleStaff hd=FactoryBellvilleStaff.getBellvilleStaff(bellStaffId,bellAccountID,bellDelivId,bellBakerId);
        System.out.println(hd);
        Assert.assertNotNull(hd.getBellStaffId()+"\n"+hd.getBellDelivId()+"\n"+hd.getBellAccountId());
    }
}
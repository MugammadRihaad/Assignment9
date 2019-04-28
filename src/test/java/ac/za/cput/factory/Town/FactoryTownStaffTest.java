package ac.za.cput.factory.Town;

import ac.za.cput.domain.Town.TownStaff;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactoryTownStaffTest {

    @Test
    public void getTownStaff() {
        String tnStaffId="bs2345";
        String tnAccountID="ba234";
        String tnDelivId="bd2345";
        String tnBakerId="bb2134";

        TownStaff hd=FactoryTownStaff.getTownStaff(tnStaffId,tnAccountID,tnDelivId,tnBakerId);
        System.out.println(hd);
        Assert.assertNotNull(hd.getTnAccountId()+"\n"+hd.getTnBakerId()+"\n"+hd.getTnDelivId()+"\n"+hd.getTnStaffId());
    }
}
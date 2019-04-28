package ac.za.cput.factory.MP;

import ac.za.cput.domain.MP.MPStaff;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactoryMPStaffTest {

    @Test
    public void getMPStaff() {
        String mpStaffId = "bs2345";
        String mpAccountID = "ba234";
        String mpDelivId = "bd2345";
        String mpBakerId = "bb2134";

        MPStaff hd = FactoryMPStaff.getMPStaff(mpStaffId, mpAccountID, mpDelivId, mpBakerId);
        System.out.println(hd);
        Assert.assertNotNull(hd.getMpAccountId() + "\n" + hd.getMpBakerId() + "\n" + hd.getMpDelivId() + "\n" + hd.getMpStaffId());
    }
}
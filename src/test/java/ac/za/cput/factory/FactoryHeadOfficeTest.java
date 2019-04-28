package ac.za.cput.factory;

import ac.za.cput.domain.HeadOffice;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactoryHeadOfficeTest {

    @Test
    public void getHeadOffice() {
        String officeId="o1345";
        String bellvilleBrId="bvbr028";
        String townBrId="tnbr012";
        String mpBrId="mpbr102";

        HeadOffice hd=FactoryHeadOffice.getHeadOffice(officeId,bellvilleBrId,townBrId,mpBrId);
        System.out.println(hd);
        Assert.assertNotNull(hd.getOfficeId()+"\n"+hd.getBellvilleBrId()+"\n"+
                hd.getTownBrId()+"\n"+hd.getMpBrId());
    }
}
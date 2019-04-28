package ac.za.cput.factory.MP;

import ac.za.cput.domain.MP.MPAccountant;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactoryMPAccountantTest {

    @Test
    public void getMPAccountant() {
        String mpAccountId="A234";
        String mpBusinessLId="bb234";
        String mpGeneralLId="bg1234";
        String mpCreditorsLId="bc345";

        MPAccountant ma=FactoryMPAccountant.getMPAccountant(mpAccountId,mpBusinessLId,mpGeneralLId,mpCreditorsLId);
        System.out.println(ma);
        Assert.assertNotNull(ma.getMpAccountId()+"\n"+ma.getMpBusinessLId()+"\n"+
                ma.getMpGeneralLId()+"\n"+ma.getMpCreditorsLId());
    }
}
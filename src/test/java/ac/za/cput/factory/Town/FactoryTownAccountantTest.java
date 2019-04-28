package ac.za.cput.factory.Town;

import ac.za.cput.domain.Town.TownAccountant;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactoryTownAccountantTest {

    @Test
    public void getTownAccountant() {
        String tnAccountId="A234";
        String tnBusinessLId="bb234";
        String tnGeneralLId="bg1234";
        String tnCreditorsLId="bc345";

        TownAccountant ta=FactoryTownAccountant.getTownAccountant(tnAccountId,tnBusinessLId,tnGeneralLId,tnCreditorsLId);
        System.out.println(ta);
        Assert.assertNotNull(ta.getTnAccountId()+"\n"+ta.getTnBusinessLId()+"\n"+
                ta.getTnGeneralLId()+"\n"+ta.getTnCreditorsLId());
    }
}
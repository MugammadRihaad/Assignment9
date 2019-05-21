package ac.za.cput.factory.Bellville;

import ac.za.cput.domain.Bellville.BellvilleAccountant;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactoryBellvilleAccountantTest {

    @Test
    public void getBellvilleAccountant() {
        String bellAccountId="A234";
        String bellLedgerId="bl123";
        String bellBusinessLId="bb234";
        String bellGeneralLId="bg1234";
        String bellCreditorsLId="bc345";

        BellvilleAccountant ba=FactoryBellvilleAccountant.getBellvilleAccountant(bellAccountId,bellLedgerId,bellBusinessLId,bellGeneralLId,bellCreditorsLId);
        System.out.println(ba);
        Assert.assertNotNull(ba.getBellAccountId()+"\n"+ba.getBellLedgerId()+"\n"+ba.getBellBusinessLId()+"\n"+
                ba.getBellGeneralLId()+"\n"+ba.getBellCreditorsLId());
    }
}
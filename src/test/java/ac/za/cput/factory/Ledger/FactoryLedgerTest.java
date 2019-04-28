package ac.za.cput.factory.Ledger;

import ac.za.cput.domain.Ledger.Ledger;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactoryLedgerTest {

    @Test
    public void getLedger() {
        String ledgerId="l032";
        String generalLId="gl234";
        String businessLId="bl57";
        String creditorsLId="cl12";

        Ledger l=FactoryLedger.getLedger(ledgerId,generalLId,businessLId,creditorsLId);
        System.out.println(l);
        Assert.assertNotNull(l.getLedgerId()+"\n"+l.getGeneralLId()+"\n"+
                l.getBusinessLId()+"\n"+l.getCreditorsLId());
    }
}
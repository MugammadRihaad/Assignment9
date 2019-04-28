package ac.za.cput.factory.Ledger;

import ac.za.cput.domain.Ledger.CreditorsLedger;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactoryCreditorsLedgerTest {

    @Test
    public void getCreditorsLedger() {
        String creditorsLId="crL015";
        String supplierName="Joko";
        double suppAmountOwed=4000;

        CreditorsLedger cl=FactoryCreditorsLedger.getCreditorsLedger(creditorsLId,supplierName,suppAmountOwed);
        System.out.println(cl);
        Assert.assertNotNull(cl.getCreditorsLId()+"\n"+cl.getSupplierName()+"\n"+
                cl.getSuppAmountOwed());

    }
}
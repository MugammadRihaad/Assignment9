package ac.za.cput.service.LedgerService.Impl;

import ac.za.cput.domain.Ledger.CreditorsLedger;
import ac.za.cput.factory.Ledger.FactoryCreditorsLedger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class CreditorsLedgerServiceImplTest {

    private CreditorsLedgerServiceImpl service;
    private CreditorsLedger cl;


    private CreditorsLedger getSaved(){
        return this.service.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.service = (CreditorsLedgerServiceImpl) CreditorsLedgerServiceImpl.getRepository();
        this.cl = FactoryCreditorsLedger.getCreditorsLedger("cl412","Shoprite",2300);
    }
    @Test
    public void create() {
        CreditorsLedger created = this.service.create(this.cl);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.cl);
    }

    @Test
    public void read() {
        CreditorsLedger saved = getSaved();
        CreditorsLedger read = this.service.read(saved.getCreditorsLId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void delete() {
        CreditorsLedger saved = getSaved();
        this.service.delete(((CreditorsLedger) saved).getCreditorsLId());
        getAll();
    }

    @Test
    public void update() {
        String creditorsLId="ci217"
                ,supplierName="Samantha";
         double suppAmountOwed=200;


        CreditorsLedger updated = new CreditorsLedger.Builder().copy(getSaved())
                .creditorsLId(creditorsLId)
                .supplierName(supplierName)
                .suppAmountOwed(suppAmountOwed)
                .build();
        System.out.println("In update, updated = " + updated);
        this.service.update(updated);
        Assert.assertSame(creditorsLId, updated.getCreditorsLId());
    }

    @Test
    public void getAll() {
        Set<CreditorsLedger> courses = this.service.getAll();
        System.out.println("In getall, all = " + courses);
    }
}
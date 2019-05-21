package ac.za.cput.service.LedgerService.Impl;

import ac.za.cput.domain.Ledger.Ledger;
import ac.za.cput.factory.Ledger.FactoryLedger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class LedgerServiceImplTest {

    private LedgerServiceImpl service;
    private Ledger l;


    private Ledger getSaved(){
        return this.service.getAll().iterator().next();
    }
    @Before
    public void setUp() throws Exception {
        this.service = (LedgerServiceImpl) LedgerServiceImpl.getRepository();
        this.l = FactoryLedger.getLedger("l482","gl871",
                "bl124","cl652");
    }

    @Test
    public void create() {
        Ledger created = this.service.create(this.l);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.l);
    }

    @Test
    public void read() {
        Ledger saved = getSaved();
        Ledger read = this.service.read(saved.getLedgerId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void delete() {
        Ledger saved = getSaved();
        this.service.delete(((Ledger) saved).getLedgerId());
        getAll();
    }

    @Test
    public void update() {
        String ledgerId="li235"
                ,generalLId="gl321",
                businessLId="bi956",
                creditorsLId="bi231";


        Ledger updated = new Ledger.Builder().copy(getSaved())
                .ledgerId(ledgerId)
                .generalLId(generalLId)
                .businessLId(businessLId)
                .creditorsLId(creditorsLId)
                .build();
        System.out.println("In update, updated = " + updated);
        this.service.update(updated);
        Assert.assertSame(ledgerId, updated.getLedgerId());
    }

    @Test
    public void getAll() {
        Set<Ledger> courses = this.service.getAll();
        System.out.println("In getall, all = " + courses);
    }
}
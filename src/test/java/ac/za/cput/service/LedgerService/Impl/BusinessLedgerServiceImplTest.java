package ac.za.cput.service.LedgerService.Impl;

import ac.za.cput.domain.Ledger.BusinessLedger;
import ac.za.cput.factory.Ledger.FactoryBusinessLedger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class BusinessLedgerServiceImplTest {

    private BusinessLedgerServiceImpl service;
    private BusinessLedger bl;


    private BusinessLedger getSaved(){
        return this.service.getAll().iterator().next();
    }
    @Before
    public void setUp() throws Exception {
        this.service = (BusinessLedgerServiceImpl) BusinessLedgerServiceImpl.getRepository();
        this.bl = FactoryBusinessLedger.getBusinessLedger("bi456","John",2000);
    }

    @Test
    public void create() {
        BusinessLedger created = this.service.create(this.bl);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.bl);
    }

    @Test
    public void read() {
        BusinessLedger saved = getSaved();
        BusinessLedger read = this.service.read(saved.getBusniessLId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void delete() {
        BusinessLedger saved = getSaved();
        this.service.delete(((BusinessLedger) saved).getBusniessLId());
        getAll();
    }

    @Test
    public void update() {
         String businessLId="bl265",
                 custName="Andy";
         double custAmountOwed=2700;


        BusinessLedger updated = new BusinessLedger.Builder().copy(getSaved())
                .businessLId(businessLId)
                .custName(custName)
                .custAmountOwed(custAmountOwed)
                .build();
        System.out.println("In update, updated = " + updated);
        this.service.update(updated);
        Assert.assertSame(businessLId, updated.getBusniessLId());
    }

    @Test
    public void getAll() {
        Set<BusinessLedger> courses = this.service.getAll();
        System.out.println("In getall, all = " + courses);
    }
}
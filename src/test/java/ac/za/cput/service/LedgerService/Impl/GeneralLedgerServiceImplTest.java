package ac.za.cput.service.LedgerService.Impl;

import ac.za.cput.domain.Ledger.GeneralLedger;
import ac.za.cput.factory.Ledger.FactoryCreditorsLedger;
import ac.za.cput.factory.Ledger.FactoryGeneralLedger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class GeneralLedgerServiceImplTest {
    private GeneralLedgerServiceImpl service;
    private GeneralLedger gl;


    private GeneralLedger getSaved(){
        return this.service.getAll().iterator().next();
    }
    @Before
    public void setUp() throws Exception {
        this.service = (GeneralLedgerServiceImpl) GeneralLedgerServiceImpl.getRepository();
        this.gl = FactoryGeneralLedger.getGeneralLedger("09/2/2013", "gl607", 1200, 400);
    }
    @Test
    public void create() {
        GeneralLedger created = this.service.create(this.gl);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.gl);
    }

    @Test
    public void read() {
        GeneralLedger saved = getSaved();
        GeneralLedger read = this.service.read(saved.getGeneralLId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void delete() {
        GeneralLedger saved = getSaved();
        this.service.delete(((GeneralLedger) saved).getGeneralLId());
        getAll();
    }

    @Test
    public void update() {
          String date="01/04/2017",generalLId="gl923";
          int totalTransaction=6;
          double totalAmount=2500;


        GeneralLedger updated = new GeneralLedger.Builder().copy(getSaved())
                .date(date)
                .generalLId(generalLId)
                .totalTrans(totalTransaction)
                .totalAmount(totalAmount)
                .build();
        System.out.println("In update, updated = " + updated);
        this.service.update(updated);
        Assert.assertSame(generalLId, updated.getGeneralLId());
    }

    @Test
    public void getAll() {
        Set<GeneralLedger> courses = this.service.getAll();
        System.out.println("In getall, all = " + courses);
    }
}
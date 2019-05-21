package ac.za.cput.service.TownService.Impl;

import ac.za.cput.domain.Town.TownAccountant;
import ac.za.cput.factory.Town.FactoryTownAccountant;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class TownAccountantServiceImplTest {

    private TownAccountantServiceImpl service;
    private TownAccountant townAccountant;


    private TownAccountant getSaved(){
        return this.service.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.service = (TownAccountantServiceImpl) TownAccountantServiceImpl.getRepository();
        this.townAccountant = FactoryTownAccountant.getTownAccountant("TN132","TB234"
                ,"TG2342","TC12232");
    }
    @Test
    public void create() {
        TownAccountant created = this.service.create(this.townAccountant);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.townAccountant);
    }

    @Test
    public void read() {
        TownAccountant saved = getSaved();
        TownAccountant read = this.service.read(saved.getTnAccountId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void delete() {
        TownAccountant saved = getSaved();
        this.service.delete(((TownAccountant) saved).getTnAccountId());
        getAll();
    }

    @Test
    public void update() {
        String newTnAccountID="BA12";
        String newTnBusniessLID="BB12";
        String newTnGeneralLID="BG12";
        String newTnCreditorsLID="BC12";
        TownAccountant updated = new TownAccountant.Builder().copy(getSaved())
                .tnAccountId(newTnAccountID)
                .tnBusinessLId(newTnBusniessLID)
                .tnGeneralLId(newTnGeneralLID)
                .tnCreditorsLId(newTnCreditorsLID)
                .build();
        System.out.println("In update, updated = " + updated);
        this.service.update(updated);
        Assert.assertSame(newTnAccountID, updated.getTnAccountId());

    }

    @Test
    public void getAll() {
        Set<TownAccountant> courses = this.service.getAll();
        System.out.println("In getall, all = " + courses);
    }
}
package ac.za.cput.service.BellvilleService.Impl;

import ac.za.cput.domain.Bellville.BellvilleAccountant;
import ac.za.cput.factory.Bellville.FactoryBellvilleAccountant;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.junit.FixMethodOrder;

import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class BellvilleAccountantServiceImplTest {
    private BellvilleAccountantServiceImpl service;
    private BellvilleAccountant bellAccount;

    private BellvilleAccountant getSaved(){
        return this.service.getAll().iterator().next();
    }


    @Before
    public void setUp() throws Exception {
        this.service = (BellvilleAccountantServiceImpl) BellvilleAccountantServiceImpl.getRepository();
        this.bellAccount = FactoryBellvilleAccountant.getBellvilleAccountant("BA132","BL234"
                ,"BB2342","BF12232","BC2352");
    }
    @Test
    public void create() {
        BellvilleAccountant created = this.service.create(this.bellAccount);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.bellAccount);
    }

    @Test
    public void read() {
        BellvilleAccountant saved = getSaved();
        BellvilleAccountant read = this.service.read(saved.getBellAccountId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void delete() {
        BellvilleAccountant saved = getSaved();
        this.service.delete(saved.getBellAccountId());
        getAll();
    }

    @Test
    public void update() {
        String newBellAccountID="BA12";
        String newBellBusniessLID="BB12";
        String newBellGeneralLID="BG12";
        String newBellCreditorsLID="BC12";
        BellvilleAccountant updated = new BellvilleAccountant.Builder().copy(getSaved())
                .bellAccountId(newBellAccountID)
                .bellBusinessLId(newBellBusniessLID)
                .bellGeneralLId(newBellGeneralLID)
                .bellCreditorsLId(newBellCreditorsLID)
                .build();
        System.out.println("In update, updated = " + updated);
        this.service.update(updated);
        Assert.assertSame(newBellAccountID, updated.getBellAccountId());



    }

    @Test
    public void getAll() {
        Set<BellvilleAccountant> courses = this.service.getAll();
        System.out.println("In getall, all = " + courses);
    }
}
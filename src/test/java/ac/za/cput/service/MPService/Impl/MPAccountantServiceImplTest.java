package ac.za.cput.service.MPService.Impl;

import ac.za.cput.domain.MP.MPAccountant;
import ac.za.cput.factory.MP.FactoryMPAccountant;
import ac.za.cput.factory.MP.FactoryMPStaff;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class MPAccountantServiceImplTest {

    private MPAccountantServiceImpl service;
    private MPAccountant mpAccount;


    private MPAccountant getSaved(){
        return this.service.getAll().iterator().next();
    }
    @Before
    public void setUp() throws Exception {
        this.service = (MPAccountantServiceImpl) MPAccountantServiceImpl.getRepository();
        this.mpAccount = FactoryMPAccountant.getMPAccountant("BA132","BL234"
                ,"BB2342","BF12232");
    }

    @Test
    public void create() {
        MPAccountant created = this.service.create(this.mpAccount);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.mpAccount);
    }

    @Test
    public void read() {
        MPAccountant saved = getSaved();
        MPAccountant read = this.service.read(saved.getMpAccountId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void delete() {
        MPAccountant saved = getSaved();
        this.service.delete(((MPAccountant) saved).getMpAccountId());
        getAll();
    }

    @Test
    public void update() {
        String newMpAccountID="BA12";
        String newMpBusniessLID="BB12";
        String newMpGeneralLID="BG12";
        String newMpCreditorsLID="BC12";
        MPAccountant updated = new MPAccountant.Builder().copy(getSaved())
                .mpAccountId(newMpAccountID)
                .mpBusinessLId(newMpBusniessLID)
                .mpGeneralLId(newMpGeneralLID)
                .mpCreditorsLId(newMpCreditorsLID)
                .build();
        System.out.println("In update, updated = " + updated);
        this.service.update(updated);
        Assert.assertSame(newMpAccountID, updated.getMpAccountId());

    }

    @Test
    public void getAll() {
        Set<MPAccountant> courses = this.service.getAll();
        System.out.println("In getall, all = " + courses);
    }
}
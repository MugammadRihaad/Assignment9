package ac.za.cput.service.BellvilleService.Impl;

import ac.za.cput.domain.Bellville.BellvilleStaff;
import ac.za.cput.factory.Bellville.FactoryBellvilleStaff;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class BellvilleStaffServiceImplTest {
    private BellvilleStaffServiceImpl service;
    private BellvilleStaff bellStaff;


    private BellvilleStaff getSaved(){
        return this.service.getAll().iterator().next();
    }
    @Before
    public void setUp() throws Exception {
        this.service = (BellvilleStaffServiceImpl) BellvilleStaffServiceImpl.getRepository();
        this.bellStaff = FactoryBellvilleStaff.getBellvilleStaff("bs345","ba457",
                "bd463","bb274");
    }

    @Test
    public void create() {
        BellvilleStaff created = this.service.create(this.bellStaff);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.bellStaff);
    }

    @Test
    public void read() {
        BellvilleStaff saved = getSaved();
        BellvilleStaff read = this.service.read(saved.getBellStaffId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void delete() {
        BellvilleStaff saved = getSaved();
        this.service.delete(((BellvilleStaff) saved).getBellAccountId());
        getAll();
    }

    @Test
    public void update() {
        String bellStaffId="bs490",
                bellAccountId="ba234",
                bellDelivId="bd967",
                bellBakerId="bb176";


        BellvilleStaff updated = new BellvilleStaff.Builder().copy(getSaved())
                .bellStaffId(bellStaffId)
                .bellAccountId(bellAccountId)
                .bellDelivId(bellDelivId)
                .bellBakerId(bellBakerId)
                .build();
        System.out.println("In update, updated = " + updated);
        this.service.update(updated);
        Assert.assertSame(bellStaffId, updated.getBellStaffId());
    }

    @Test
    public void getAll() {
        Set<BellvilleStaff> courses = this.service.getAll();
        System.out.println("In getall, all = " + courses);
    }
}
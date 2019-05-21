package ac.za.cput.service.MPService.Impl;

import ac.za.cput.domain.MP.MPStaff;
import ac.za.cput.factory.MP.FactoryMPStaff;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class MPStaffServiceImplTest {


    private MPStaffServiceImpl service;
    private MPStaff mpStaff;


    private MPStaff getSaved(){
        return this.service.getAll().iterator().next();
    }
    @Before
    public void setUp() throws Exception {
        this.service = (MPStaffServiceImpl) MPStaffServiceImpl.getRepository();
        this.mpStaff = FactoryMPStaff.getMPStaff("bs345","ba457",
                "bd463","bb274");
    }
    @Test
    public void create() {
        MPStaff created = this.service.create(this.mpStaff);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.mpStaff);
    }

    @Test
    public void read() {
        MPStaff saved = getSaved();
        MPStaff read = this.service.read(saved.getMpStaffId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void delete() {
        MPStaff saved = getSaved();
        this.service.delete(((MPStaff) saved).getMpStaffId());
        getAll();
    }

    @Test
    public void update() {
        String mpStaffId="bs490",
                mpAccountId="ba234",
                mpDelivId="bd967",
                mpBakerId="bb176";


        MPStaff updated = new MPStaff.Builder().copy(getSaved())
                .mpAccountId(mpAccountId)
                .mpStaffId(mpStaffId)
                .mpDelivId(mpDelivId)
                .mpBakerId(mpBakerId)
                .build();
        System.out.println("In update, updated = " + updated);
        this.service.update(updated);
        Assert.assertSame(mpStaff, updated.getMpStaffId());

    }

    @Test
    public void getAll() {
        Set<MPStaff> courses = this.service.getAll();
        System.out.println("In getall, all = " + courses);
    }
}
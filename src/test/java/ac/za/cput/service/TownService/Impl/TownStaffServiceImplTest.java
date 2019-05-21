package ac.za.cput.service.TownService.Impl;

import ac.za.cput.domain.Town.TownStaff;
import ac.za.cput.factory.Town.FactoryTownStaff;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class TownStaffServiceImplTest {

    private TownStaffServiceImpl service;
    private TownStaff townStaff;


    private TownStaff getSaved(){
        return this.service.getAll().iterator().next();
    }
    @Before
    public void setUp() throws Exception {
        this.service = (TownStaffServiceImpl) TownStaffServiceImpl.getRepository();
        this.townStaff = FactoryTownStaff.getTownStaff("ts345","ta457",
                "td463","tb274");
    }

    @Test
    public void create() {
        TownStaff created = this.service.create(this.townStaff);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.townStaff);
    }

    @Test
    public void read() {
        TownStaff saved = getSaved();
        TownStaff read = this.service.read(saved.getTnStaffId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void delete() {
        TownStaff saved = getSaved();
        this.service.delete(((TownStaff) saved).getTnStaffId());
        getAll();
    }

    @Test
    public void update() {
        String tnStaffId="bs490",
                tnAccountId="ba234",
                tnDelivId="bd967",
                tnBakerId="bb176";


        TownStaff updated = new TownStaff.Builder().copy(getSaved())
                .tnAccountId(tnAccountId)
                .tnStaffId(tnStaffId)
                .tnDelivId(tnDelivId)
                .tnBakerId(tnBakerId)
                .build();
        System.out.println("In update, updated = " + updated);
        this.service.update(updated);
        Assert.assertSame(tnStaffId, updated.getTnStaffId());

    }

    @Test
    public void getAll() {
        Set<TownStaff> courses = this.service.getAll();
        System.out.println("In getall, all = " + courses);
    }
}
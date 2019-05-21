package ac.za.cput.service.MPService.Impl;

import ac.za.cput.domain.MP.MPBaker;
import ac.za.cput.factory.MP.FactoryMPBaker;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class MPBakerServiceImplTest {

    private MPBakerServiceImpl service;
    private MPBaker mpBaker;


    private MPBaker getSaved(){
        return this.service.getAll().iterator().next();
    }
    @Before
    public void setUp() throws Exception {
        this.service = (MPBakerServiceImpl) MPBakerServiceImpl.getRepository();
        this.mpBaker = FactoryMPBaker.getMPBaker("bb234","James"
                ,5000);
    }

    @Test
    public void create() {
        MPBaker created = this.service.create(this.mpBaker);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.mpBaker);
    }

    @Test
    public void read() {
        MPBaker saved = getSaved();
        MPBaker read = this.service.read(saved.getMpBakerId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void delete() {
        MPBaker saved = getSaved();
        this.service.delete(((MPBaker) saved).getMpBakerId());
        getAll();
    }

    @Test
    public void update() {
        String  bakerId="bb567";
        String  bakerName="John";
        double salary =6000;

        MPBaker updated = new MPBaker.Builder().copy(getSaved())
                .mpBakerId(bakerId)
                .mpBakerName(bakerName)
                .mpBakerSalary(salary)
                .build();
        System.out.println("In update, updated = " + updated);
        this.service.update(updated);
        Assert.assertSame(bakerId, updated.getMpBakerId());
    }

    @Test
    public void getAll() {
        Set<MPBaker> courses = this.service.getAll();
        System.out.println("In getall, all = " + courses);
    }
}
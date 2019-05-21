package ac.za.cput.service.TownService.Impl;

import ac.za.cput.domain.Town.TownBaker;
import ac.za.cput.factory.Town.FactoryTownBaker;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class TownBakerServiceImplTest {

    private TownBakerServiceImpl service;
    private TownBaker townBaker;


    private TownBaker getSaved(){
        return this.service.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.service = (TownBakerServiceImpl) TownBakerServiceImpl.getRepository();
        this.townBaker = FactoryTownBaker.getTownBaker("tb234","James"
                ,5000);
    }
    @Test
    public void create() {
        TownBaker created = this.service.create(this.townBaker);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.townBaker);
    }

    @Test
    public void read() {
        TownBaker saved = getSaved();
        TownBaker read = this.service.read(saved.getTnBakerId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void delete() {
        TownBaker saved = getSaved();
        this.service.delete(((TownBaker) saved).getTnBakerId());
        getAll();
    }

    @Test
    public void update() {
        String  bakerId="bb567";
        String  bakerName="John";
        double salary =6000;

        TownBaker updated = new TownBaker.Builder().copy(getSaved())
                .tnBakerId(bakerId)
                .tnBakerName(bakerName)
                .tnBakerSalary(salary)
                .build();
        System.out.println("In update, updated = " + updated);
        this.service.update(updated);
        Assert.assertSame(bakerId, updated.getTnBakerId());
    }

    @Test
    public void getAll() {
        Set<TownBaker> courses = this.service.getAll();
        System.out.println("In getall, all = " + courses);
    }
}
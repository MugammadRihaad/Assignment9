package ac.za.cput.service.BellvilleService.Impl;

import ac.za.cput.domain.Bellville.bellvilleBaker;
import ac.za.cput.factory.Bellville.FactoryBellvilleBaker;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class BellvilleBakerServiceImplTest {
    private BellvilleBakerServiceImpl service;
    private bellvilleBaker bellbakert;


    private bellvilleBaker getSaved(){
        return this.service.getAll().iterator().next();
    }


    @Before
    public void setUp() throws Exception {
        this.service = (BellvilleBakerServiceImpl) BellvilleBakerServiceImpl.getRepository();
        this.bellbakert = FactoryBellvilleBaker.getBellvilleBaker("bb234","James"
                ,5000);
    }
    @Test
    public void create() {
        bellvilleBaker created = this.service.create(this.bellbakert);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.bellbakert);
    }

    @Test
    public void read() {
        bellvilleBaker saved = getSaved();
        bellvilleBaker read = this.service.read(saved.getBellBakerId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void delete() {
        bellvilleBaker saved = getSaved();
        this.service.delete(saved.getBellBakerId());
        getAll();
    }

    @Test
    public void update() {
        String  bakerId="bb567";
        String  bakerName="John";
        double salary =6000;

        bellvilleBaker updated = new bellvilleBaker.Builder().copy(getSaved())
                .bellBakerId(bakerId)
                .bellBakerName(bakerName)
                .bellBakerSalary(salary)
                .build();
        System.out.println("In update, updated = " + updated);
        this.service.update(updated);
        Assert.assertSame(bakerId, updated.getBellBakerId());

    }

    @Test
    public void getAll() {
        Set<bellvilleBaker> courses = this.service.getAll();
        System.out.println("In getall, all = " + courses);
    }}
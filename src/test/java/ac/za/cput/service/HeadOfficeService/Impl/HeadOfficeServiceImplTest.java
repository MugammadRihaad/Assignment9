package ac.za.cput.service.HeadOfficeService.Impl;

import ac.za.cput.domain.HeadOffice;
import ac.za.cput.factory.FactoryHeadOffice;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class HeadOfficeServiceImplTest {
    private HeadOfficeServiceImpl service;
    private HeadOffice office;


    private HeadOffice getSaved(){
        return this.service.getAll().iterator().next();
    }


    @Before
    public void setUp() throws Exception {
        this.service = (HeadOfficeServiceImpl) HeadOfficeServiceImpl.getRepository();
        this.office = FactoryHeadOffice.getHeadOffice("od859","bbr645",
                "tbr412","mp192");
    }
    @Test
    public void create() {
        HeadOffice created = this.service.create(this.office);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.office);
    }

    @Test
    public void read() {
        HeadOffice saved = getSaved();
        HeadOffice read = this.service.read(saved.getOfficeId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void delete() {
        HeadOffice saved = getSaved();
        this.service.delete(((HeadOffice) saved).getOfficeId());
        getAll();
    }

    @Test
    public void update() {
        String officeId="oi345",
                bellvilleBrId="bbr264",
                townBrId="tbr278",
                mpBrId="mbr581";


        HeadOffice updated = new HeadOffice.Builder().copy(getSaved())
                .officeId(officeId)
                .bellvilleBrId(bellvilleBrId)
                .townBrId(townBrId)
                .mpBrId(mpBrId)
                .build();
        System.out.println("In update, updated = " + updated);
        this.service.update(updated);
        Assert.assertSame(officeId, updated.getOfficeId());
    }

    @Test
    public void getAll() {
        Set<HeadOffice> courses = this.service.getAll();
        System.out.println("In getall, all = " + courses);
    }
}
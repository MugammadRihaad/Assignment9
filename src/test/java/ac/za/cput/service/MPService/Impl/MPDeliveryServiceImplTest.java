package ac.za.cput.service.MPService.Impl;

import ac.za.cput.domain.MP.MPDelivery;
import ac.za.cput.factory.MP.FactoryMPDelivery;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class MPDeliveryServiceImplTest {

    private MPDeliveryServiceImpl service;
    private MPDelivery mpDeliv;


    private MPDelivery getSaved(){
        return this.service.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.service = (MPDeliveryServiceImpl) MPDeliveryServiceImpl.getRepository();
        this.mpDeliv = FactoryMPDelivery.getMPDelivery("bd345","bs457");
    }
    @Test
    public void create() {
        MPDelivery created = this.service.create(this.mpDeliv);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.mpDeliv);
    }

    @Test
    public void read() {
        MPDelivery saved = getSaved();
        MPDelivery read = this.service.read(saved.getMpDeliveId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void delete() {
        MPDelivery saved = getSaved();
        this.service.delete(((MPDelivery) saved).getMpDeliveId());
        getAll();
    }

    @Test
    public void update() {
        String  newmpDeliveId="bd346",mpStockId="bs812";


        MPDelivery updated = new MPDelivery.Builder().copy(getSaved())
                .mpDeliveId(mpStockId)
                .mpStockId(mpStockId)
                .build();
        System.out.println("In update, updated = " + updated);
        this.service.update(updated);
        Assert.assertSame(mpDeliv, updated.getMpDeliveId());
    }

    @Test
    public void getAll() {
        Set<MPDelivery> courses = this.service.getAll();
        System.out.println("In getall, all = " + courses);
    }
}
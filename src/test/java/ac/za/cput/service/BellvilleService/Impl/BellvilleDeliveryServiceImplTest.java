package ac.za.cput.service.BellvilleService.Impl;

import ac.za.cput.domain.Bellville.BellvilleDelivery;
import ac.za.cput.factory.Bellville.FactoryBellvilleDelivery;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class BellvilleDeliveryServiceImplTest {
    private BellvilleDeliveryServiceImpl service;
    private BellvilleDelivery bellDelivery;


    private BellvilleDelivery getSaved(){
        return this.service.getAll().iterator().next();
    }
    @Before
    public void setUp() throws Exception {
        this.service = (BellvilleDeliveryServiceImpl) BellvilleDeliveryServiceImpl.getRepository();
        this.bellDelivery = FactoryBellvilleDelivery.getBellvilleDelivery("bd345","bs457");
    }

    @Test
    public void create() {
        BellvilleDelivery created = this.service.create(this.bellDelivery);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.bellDelivery);
    }

    @Test
    public void read() {
        BellvilleDelivery saved = getSaved();
        BellvilleDelivery read = this.service.read(saved.getBellDeliveId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void delete() {
        BellvilleDelivery saved = getSaved();
        this.service.delete(((BellvilleDelivery) saved).getBellDeliveId());
        getAll();
    }

    @Test
    public void update() {
        String  newbellDeliveId="bd346",bellStockId="bs812";


        BellvilleDelivery updated = new BellvilleDelivery.Builder().copy(getSaved())
                .bellDeliveId(newbellDeliveId)
                .bellStockId(bellStockId)
                .build();
        System.out.println("In update, updated = " + updated);
        this.service.update(updated);
        Assert.assertSame(newbellDeliveId, updated.getBellDeliveId());

    }

    @Test
    public void getAll() {
        Set<BellvilleDelivery> courses = this.service.getAll();
        System.out.println("In getall, all = " + courses);
    }
}
package ac.za.cput.service.TownService.Impl;

import ac.za.cput.domain.Town.TownDelivery;
import ac.za.cput.factory.Town.FactoryTownDelivery;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class TownDeliveryServiceImplTest {

    private TownDeliveryServiceImpl service;
    private TownDelivery townDelivery;


    private TownDelivery getSaved(){
        return this.service.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.service = (TownDeliveryServiceImpl) TownDeliveryServiceImpl.getRepository();
        this.townDelivery = FactoryTownDelivery.getTownDelivery("td345","ts457");
    }
    @Test
    public void create() {
        TownDelivery created = this.service.create(this.townDelivery);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.townDelivery);
    }

    @Test
    public void read() {
        TownDelivery saved = getSaved();
        TownDelivery read = this.service.read(saved.getTnDeliveId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void delete() {
        TownDelivery saved = getSaved();
        this.service.delete(((TownDelivery) saved).getTnDeliveId());
        getAll();
    }

    @Test
    public void update() {
        String  newtnDeliveId="bd346",tnStockId="bs812";


        TownDelivery updated = new TownDelivery.Builder().copy(getSaved())
                .tnDeliveId(tnStockId)
                .tnStockId(tnStockId)
                .build();
        System.out.println("In update, updated = " + updated);
        this.service.update(updated);
        Assert.assertSame(newtnDeliveId, updated.getTnDeliveId());

    }

    @Test
    public void getAll() {
        Set<TownDelivery> courses = this.service.getAll();
        System.out.println("In getall, all = " + courses);
    }
}
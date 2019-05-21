package ac.za.cput.service.StockDeliveriesService.Impl;

import ac.za.cput.domain.StockDeliveries.Deliveries;
import ac.za.cput.factory.StockDeliveries.FactoryDeliveries;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class DeliveryServiceImplTest {




    private DeliveryServiceImpl service;
    private Deliveries deliv;


    private Deliveries getSaved(){
        return this.service.getAll().iterator().next();
    }
    @Before
    public void setUp() throws Exception {
        this.service = (DeliveryServiceImpl) DeliveryServiceImpl.getRepository();
        this.deliv = FactoryDeliveries.getDeliveries("di234","Mike",
                5,300);
    }

    @Test
    public void create() {
        Deliveries created = this.service.create(this.deliv);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.deliv);
    }

    @Test
    public void read() {
        Deliveries saved = getSaved();
        Deliveries read = this.service.read(saved.getDelivId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void delete() {
        Deliveries saved = getSaved();
        this.service.delete(((Deliveries) saved).getDelivId());
        getAll();
    }

    @Test
    public void update() {
         String delivId="di421",
                 delivName="Brandon";
         int delivAmount=7;
         double delivPriceUnit=100;


        Deliveries updated = new Deliveries.Builder().copy(getSaved())
                .delivId(delivId)
                .delivName(delivName)
                .delivAmount(delivAmount)
                .delivPriceUnit(delivPriceUnit)
                .build();
        System.out.println("In update, updated = " + updated);
        this.service.update(updated);
        Assert.assertSame(delivId, updated.getDelivId());

    }

    @Test
    public void getAll() {
        Set<Deliveries> courses = this.service.getAll();
        System.out.println("In getall, all = " + courses);
    }
}
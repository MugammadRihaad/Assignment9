package ac.za.cput.service.StockDeliveriesService.Impl;

import ac.za.cput.domain.StockDeliveries.StockDeliveries;
import ac.za.cput.factory.StockDeliveries.FactoryStockDeliveries;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class StockDeliveriesServiceImplTest {



    private StockDeliveriesServiceImpl service;
    private StockDeliveries stockDel;


    private StockDeliveries getSaved(){
        return this.service.getAll().iterator().next();
    }
    @Before
    public void setUp() throws Exception {
        this.service = (StockDeliveriesServiceImpl) StockDeliveriesServiceImpl.getRepository();
        this.stockDel = FactoryStockDeliveries.getStockDeliveries("dd842",
                "sd5384","si823");
    }

    @Test
    public void create() {
        StockDeliveries created = this.service.create(this.stockDel);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.stockDel);
    }

    @Test
    public void read() {
        StockDeliveries saved = getSaved();
        StockDeliveries read = this.service.read(saved.getDelId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void delete() {
        StockDeliveries saved = getSaved();
        this.service.delete(((StockDeliveries) saved).getDelId());
        getAll();
    }

    @Test
    public void update() {
         String delId="di426"
                 ,stockdelId="sd205"
                 ,stockId="si905";


        StockDeliveries updated = new StockDeliveries.Builder().copy(getSaved())
                .delId(delId)
                .stockdelId(stockdelId)
                .stockId(stockId)
                .build();
        System.out.println("In update, updated = " + updated);
        this.service.update(updated);
        Assert.assertSame(delId, updated.getDelId());

    }

    @Test
    public void getAll() {
        Set<StockDeliveries> courses = this.service.getAll();
        System.out.println("In getall, all = " + courses);
    }
}
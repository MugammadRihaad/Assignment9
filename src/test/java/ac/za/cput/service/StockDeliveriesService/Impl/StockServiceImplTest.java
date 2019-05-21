package ac.za.cput.service.StockDeliveriesService.Impl;

import ac.za.cput.domain.StockDeliveries.Stock;
import ac.za.cput.factory.StockDeliveries.FactoryStock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class StockServiceImplTest {



    private StockServiceImpl service;
    private Stock stock;


    private Stock getSaved(){
        return this.service.getAll().iterator().next();
    }
    @Before
    public void setUp() throws Exception {
        this.service = (StockServiceImpl) StockServiceImpl.getRepository();
        this.stock = FactoryStock.getStock("si462",
                "sc163",5,21);
    }

    @Test
    public void create() {
        Stock created = this.service.create(this.stock);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.service);
    }

    @Test
    public void read() {
        Stock saved = getSaved();
        Stock read = this.service.read(saved.getStockId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void delete() {
        Stock saved = getSaved();
        this.service.delete(((Stock) saved).getStockId());
        getAll();
    }

    @Test
    public void update() {
         String stockId="si780",
                 stockCate="sc12";
         int stockAmount=9;
         double stockWeight=20;


        Stock updated = new Stock.Builder().copy(getSaved())
                .stockId(stockId)
                .stockCate(stockCate)
                .stockAmount(stockAmount)
                .stockWeight(stockWeight)
                .build();
        System.out.println("In update, updated = " + updated);
        this.service.update(updated);
        Assert.assertSame(stockId, updated.getStockId());

    }

    @Test
    public void getAll() {
        Set<Stock> courses = this.service.getAll();
        System.out.println("In getall, all = " + courses);
    }
}
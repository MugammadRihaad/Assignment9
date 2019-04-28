package ac.za.cput.repository.StockDeliveriesRepo.Impl;

import ac.za.cput.domain.StockDeliveries.StockDeliveries;
import ac.za.cput.repository.StockDeliveriesRepo.StockDeliveriesRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class StockDeliveriesRepositoryImplTest {


    private StockDeliveriesRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = StockDeliveriesRepositoryImpl.getRepository();
    }

    @Test
    public void create() {
        this.repository.create(null);
        Assert.assertEquals(null, null);
    }

    @Test
    public void read() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void update() {
    }

    @Test
    public void getAll() {
        Set<StockDeliveries> stockDel = this.repository.getAll();
        Assert.assertEquals(1, stockDel.size());
    }
}
package ac.za.cput.repository.StockDeliveriesRepo.Impl;

import ac.za.cput.domain.StockDeliveries.Stock;
import ac.za.cput.repository.StockDeliveriesRepo.StockRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class StockRepositoryImplTest {


    private StockRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = StockRepositoryImpl.getRepository();
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
        Set<Stock> stock = this.repository.getAll();
        Assert.assertEquals(1, stock.size());
    }
}
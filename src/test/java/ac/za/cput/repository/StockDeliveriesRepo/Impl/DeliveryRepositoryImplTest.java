package ac.za.cput.repository.StockDeliveriesRepo.Impl;

import ac.za.cput.domain.StockDeliveries.Deliveries;
import ac.za.cput.repository.StockDeliveriesRepo.DeliveryRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class DeliveryRepositoryImplTest {


    private DeliveryRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = DeliveryRepositoryImpl.getRepository();
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
        Set<Deliveries> deliveries = this.repository.getAll();
        Assert.assertEquals(1, deliveries.size());
    }
}
package ac.za.cput.repository.BellvilleRepo.Impl;

import ac.za.cput.domain.Bellville.BellvilleDelivery;
import ac.za.cput.repository.BellvilleRepo.BellvilleDeliveryRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class BellvilleDeliveryRepositoryImplTest {

    private BellvilleDeliveryRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = BellvilleDeliveryRepositoryImpl.getRepository();
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
        Set<BellvilleDelivery> bellDev = this.repository.getAll();
        Assert.assertEquals(1, bellDev.size());
    }
}
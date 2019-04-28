package ac.za.cput.repository.TownRepo.Impl;

import ac.za.cput.domain.Town.TownDelivery;
import ac.za.cput.repository.TownRepo.TownDeliveryRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class TownDeliveryRepositoryImplTest {


    private TownDeliveryRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = TownDeliveryRepositoryImpl.getRepository();
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
        Set<TownDelivery> tnDel = this.repository.getAll();
        Assert.assertEquals(1, tnDel.size());
    }
}
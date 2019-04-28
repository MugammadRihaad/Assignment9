package ac.za.cput.repository.BellvilleRepo.Impl;

import ac.za.cput.domain.Bellville.ProductCakes;
import ac.za.cput.repository.BellvilleRepo.ProductCakesRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class ProductCakesRepositoryImplTest {


    private ProductCakesRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = ProductCakesRepositoryImpl.getRepository();
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
        Set<ProductCakes> cakes = this.repository.getAll();
        Assert.assertEquals(1, cakes.size());
    }
}
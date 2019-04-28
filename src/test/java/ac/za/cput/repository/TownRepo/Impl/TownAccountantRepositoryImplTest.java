package ac.za.cput.repository.TownRepo.Impl;

import ac.za.cput.domain.Town.TownAccountant;
import ac.za.cput.repository.TownRepo.TownAccountantRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class TownAccountantRepositoryImplTest {


    private TownAccountantRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = TownAccountantRepositoryImpl.getRepository();
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
        Set<TownAccountant> accountants = this.repository.getAll();
        Assert.assertEquals(1, accountants.size());
    }
}
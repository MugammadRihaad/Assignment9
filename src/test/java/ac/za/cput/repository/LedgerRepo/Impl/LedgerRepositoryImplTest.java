package ac.za.cput.repository.LedgerRepo.Impl;

import ac.za.cput.domain.Ledger.Ledger;
import ac.za.cput.repository.LedgerRepo.LedgerRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class LedgerRepositoryImplTest {


    private LedgerRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = LedgerRepositoryImpl.getRepository();
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
        Set<Ledger> ledger = this.repository.getAll();
        Assert.assertEquals(1, ledger.size());
    }
}
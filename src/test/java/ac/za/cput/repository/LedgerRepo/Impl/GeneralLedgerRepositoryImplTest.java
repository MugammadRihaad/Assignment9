package ac.za.cput.repository.LedgerRepo.Impl;

import ac.za.cput.domain.Ledger.GeneralLedger;
import ac.za.cput.repository.LedgerRepo.GeneralLedgerRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class GeneralLedgerRepositoryImplTest {


    private GeneralLedgerRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = GeneralLedgerRepositoryImpl.getRepository();
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
        Set<GeneralLedger> genLedger = this.repository.getAll();
        Assert.assertEquals(1, genLedger.size());
    }
}
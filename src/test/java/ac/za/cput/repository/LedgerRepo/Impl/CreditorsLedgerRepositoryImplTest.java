package ac.za.cput.repository.LedgerRepo.Impl;

import ac.za.cput.domain.Ledger.CreditorsLedger;
import ac.za.cput.repository.LedgerRepo.CreditorsLedgerRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class CreditorsLedgerRepositoryImplTest {


    private CreditorsLedgerRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = CreditorsLedgerRepositoryImpl.getRepository();
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
        Set<CreditorsLedger> credLedger = this.repository.getAll();
        Assert.assertEquals(1, credLedger.size());
    }
}
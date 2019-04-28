package ac.za.cput.repository.LedgerRepo.Impl;

import ac.za.cput.domain.Ledger.BusinessLedger;
import ac.za.cput.repository.LedgerRepo.BusinessLedgerRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class BusinessLedgerRepositoryImplTest {


    private BusinessLedgerRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = BusinessLedgerRepositoryImpl.getRepository();
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
        Set<BusinessLedger> busLedger = this.repository.getAll();
        Assert.assertEquals(1, busLedger.size());
    }
}
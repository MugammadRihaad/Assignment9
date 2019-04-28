package ac.za.cput.repository.BellvilleRepo.Impl;

import ac.za.cput.domain.Bellville.BellvilleStaff;
import ac.za.cput.repository.BellvilleRepo.BellvilleStaffRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class BellvilleStaffRepositoryImplTest {

    private BellvilleStaffRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = BellvilleStaffRepositoryImpl.getRepository();
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
        Set<BellvilleStaff> bellStaff = this.repository.getAll();
        Assert.assertEquals(1, bellStaff.size());
    }
}
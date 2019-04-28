package ac.za.cput.repository.TownRepo.Impl;

import ac.za.cput.domain.Town.TownStaff;
import ac.za.cput.repository.TownRepo.TownStaffRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class TownStaffRepositoryImplTest {


    private TownStaffRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = TownStaffRepositoryImpl.getRepository();
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
        Set<TownStaff> staff = this.repository.getAll();
        Assert.assertEquals(1, staff.size());
    }
}
package ac.za.cput.repository.HeadOffice.Impl;

import ac.za.cput.domain.HeadOffice;
import ac.za.cput.repository.HeadOffice.HeadOfficeRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class HeadOfficeRepositoryImplTest {


    private HeadOfficeRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = HeadOfficeRepositoryImpl.getRepository();
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
        Set<HeadOffice> headOffices = this.repository.getAll();
        Assert.assertEquals(1, headOffices.size());
    }
}
package ac.za.cput.repository.MPRepo.Impl;

import ac.za.cput.domain.MP.MPBranch;
import ac.za.cput.repository.MPRepo.MPBranchRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class MPBranchRepositoryImplTest {


    private MPBranchRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = MPBranchRepositoryImpl.getRepository();
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
        Set<MPBranch> branch = this.repository.getAll();
        Assert.assertEquals(1, branch.size());
    }
}
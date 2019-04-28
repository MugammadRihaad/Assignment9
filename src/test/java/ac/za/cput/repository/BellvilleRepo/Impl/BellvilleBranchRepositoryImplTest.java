package ac.za.cput.repository.BellvilleRepo.Impl;

import ac.za.cput.domain.Bellville.BellvilleBranch;
import ac.za.cput.repository.BellvilleRepo.BellvilleBakerRepository;
import ac.za.cput.repository.BellvilleRepo.BellvilleBranchRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class BellvilleBranchRepositoryImplTest {

    private BellvilleBranchRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = BellvilleBranchRepositoryImpl.getRepository();
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
        Set<BellvilleBranch> branch = this.repository.getAll();
        Assert.assertEquals(1, branch.size());
    }
}
package ac.za.cput.repository.BellvilleRepo.Impl;

import ac.za.cput.domain.Bellville.BellvilleAccountant;
import ac.za.cput.factory.Bellville.FactoryBellvilleAccountant;
import ac.za.cput.repository.BellvilleRepo.BellvilleAccountantRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class BellvilleAccountantRepoImplTest {

    private BellvilleAccountantRepository repository;
    private BellvilleAccountant bellAccount;

    private BellvilleAccountant getSavedbellAccount() {
        Set<BellvilleAccountant> savedCourses = this.repository.getAll();
        return savedCourses.iterator().next();
    }
    @Before
    public void setUp() throws Exception {
        this.repository = BellvilleAccountantRepoImpl.getRepository();
        this.bellAccount = FactoryBellvilleAccountant.getBellvilleAccountant("BA132","BL234"
                ,"BB2342","BF12232","BC2352");
    }

    @Test
    public void create() {
        BellvilleAccountant created = this.repository.create(this.bellAccount);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.bellAccount);
    }

    @Test
    public void read() {
        BellvilleAccountant savedCourse = getSavedbellAccount();
        System.out.println("In read, courseId = "+ savedCourse.getBellAccountId());
        BellvilleAccountant read = this.repository.read(savedCourse.getBellAccountId());
        System.out.println("In read, read = " + read);
        getAll();
        Assert.assertEquals(savedCourse, read);

    }

    @Test
    public void delete() {
        BellvilleAccountant savedAccount = getSavedbellAccount();
        this.repository.delete(savedAccount.getBellAccountId());
        getAll();

    }

    @Test
    public void update() {
        String newBellAccountID="BA12";
        String newBellBusniessLID="BB12";
        String newBellGeneralLID="BG12";
        String newBellCreditorsLID="BC12";
        BellvilleAccountant updated = new BellvilleAccountant.Builder().copy(getSavedbellAccount())
                .bellAccountId(newBellAccountID)
                .bellBusinessLId(newBellBusniessLID)
                .bellGeneralLId(newBellGeneralLID)
                .bellCreditorsLId(newBellCreditorsLID)
                .build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newBellAccountID, updated.getBellAccountId());

    }

    @Test
    public void getAll() {
        Set<BellvilleAccountant> Accountants = this.repository.getAll();
        Assert.assertEquals(1, Accountants.size());
    }
}
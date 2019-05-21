package ac.za.cput.service.BellvilleService.Impl;

import ac.za.cput.domain.Bellville.BellvilleBranch;
import ac.za.cput.factory.Bellville.FactoryBellvilleBranch;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class BellvilleBranchServiceImplTest {
    private BellvilleBranchServiceImpl service;
    private BellvilleBranch bellBranch;


    private BellvilleBranch getSaved(){
        return this.service.getAll().iterator().next();
    }
    @Before
    public void setUp() throws Exception {
        this.service = (BellvilleBranchServiceImpl) BellvilleBranchServiceImpl.getRepository();
        this.bellBranch = FactoryBellvilleBranch.getBellvillBranch("bbr345","bs457");
    }


    @Test
    public void create() {
        BellvilleBranch created = this.service.create(this.bellBranch);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.bellBranch);
    }

    @Test
    public void read() {
        BellvilleBranch saved = getSaved();
        BellvilleBranch read = this.service.read(saved.getBellBrId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void delete() {
        BellvilleBranch saved = getSaved();
        this.service.delete(((BellvilleBranch) saved).getBellBrId());
        getAll();
    }

    @Test
    public void update() {

        String newBellBranchId="bbr345";
        String newBellStaffId="bs3454";

        BellvilleBranch updated = new BellvilleBranch.Builder().copy(getSaved())
                .bellBrId(newBellBranchId)
                .bellStaffId(newBellStaffId)

                .build();
        System.out.println("In update, updated = " + updated);
        this.service.update(updated);
        Assert.assertSame(newBellBranchId, updated.getBellBrId());
    }

    @Test
    public void getAll() {
        Set<BellvilleBranch> courses = this.service.getAll();
        System.out.println("In getall, all = " + courses);
    }
}
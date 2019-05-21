package ac.za.cput.service.MPService.Impl;

import ac.za.cput.domain.MP.MPBranch;
import ac.za.cput.factory.MP.FactoryMPBranch;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class MPBranchServiceImplTest {

    private MPBranchServiceImpl service;
    private MPBranch mpBranch;


    private MPBranch getSaved(){
        return this.service.getAll().iterator().next();
    }
    @Before
    public void setUp() throws Exception {
        this.service = (MPBranchServiceImpl) MPBranchServiceImpl.getRepository();
        this.mpBranch = FactoryMPBranch.getMPBranch("bbr345","bs457");
    }

    @Test
    public void create() {
        MPBranch created = this.service.create(this.mpBranch);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.mpBranch);
    }

    @Test
    public void read() {
        MPBranch saved = getSaved();
        MPBranch read = this.service.read(saved.getMpBrId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void delete() {
        MPBranch saved = getSaved();
        this.service.delete(((MPBranch) saved).getMpBrId());
        getAll();
    }

    @Test
    public void update() {
        String newMpBranchId="bbr345";
        String newMplStaffId="bs3454";

        MPBranch updated = new MPBranch.Builder().copy(getSaved())
                .mpBrId(newMpBranchId)
                .mpStaffId(newMplStaffId)

                .build();
        System.out.println("In update, updated = " + updated);
        this.service.update(updated);
        Assert.assertSame(newMpBranchId, updated.getMpBrId());

    }

    @Test
    public void getAll() {
        Set<MPBranch> courses = this.service.getAll();
        System.out.println("In getall, all = " + courses);
    }
}
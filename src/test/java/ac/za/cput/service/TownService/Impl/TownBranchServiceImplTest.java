package ac.za.cput.service.TownService.Impl;

import ac.za.cput.domain.Town.TownBranch;
import ac.za.cput.factory.Town.FactoryTownBranch;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class TownBranchServiceImplTest {


    private TownBranchServiceImpl service;
    private TownBranch townBranch;


    private TownBranch getSaved(){
        return this.service.getAll().iterator().next();
    }
    @Before
    public void setUp() throws Exception {
        this.service = (TownBranchServiceImpl) TownBranchServiceImpl.getRepository();
        this.townBranch = FactoryTownBranch.getTownBranch("tbr345","ts457");
    }

    @Test
    public void create() {
        TownBranch created = this.service.create(this.townBranch);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.townBranch);
    }

    @Test
    public void read() {
        TownBranch saved = getSaved();
        TownBranch read = this.service.read(saved.getTnBrId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void delete() {
        TownBranch saved = getSaved();
        this.service.delete(((TownBranch) saved).getTnBrId());
        getAll();
    }

    @Test
    public void update() {
        String newTnBranchId="bbr345";
        String newTnlStaffId="bs3454";

        TownBranch updated = new TownBranch.Builder().copy(getSaved())
                .tnBrId(newTnBranchId)
                .tnStaffId(newTnlStaffId)

                .build();
        System.out.println("In update, updated = " + updated);
        this.service.update(updated);
        Assert.assertSame(newTnBranchId, updated.getTnBrId());
    }

    @Test
    public void getAll() {
        Set<TownBranch> courses = this.service.getAll();
        System.out.println("In getall, all = " + courses);
    }
}
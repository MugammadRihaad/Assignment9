package ac.za.cput.factory.Town;

import ac.za.cput.domain.Town.TownBranch;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactoryTownBranchTest {

    @Test
    public void getTownBranch() {
        String tnBrId="BBr203";
        String tnStaffId="bs573";

        TownBranch hd=FactoryTownBranch.getTownBranch(tnBrId,tnStaffId);
        System.out.println(hd);
        Assert.assertNotNull(hd.getTnBrId()+"\n"+hd.getTnStaffId());
    }
    }

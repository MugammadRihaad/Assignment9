package ac.za.cput.factory.MP;

import ac.za.cput.domain.MP.MPBranch;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactoryMPBranchTest {

    @Test
    public void getMPBranch() {
        String mpBrId="BBr203";
        String mpStaffId="bs573";

        MPBranch hd=FactoryMPBranch.getMPBranch(mpBrId,mpStaffId);
        System.out.println(hd);
        Assert.assertNotNull(hd.getMpBrId()+"\n"+hd.getMpStaffId());

    }
    }

package ac.za.cput.factory.Bellville;

import ac.za.cput.domain.Bellville.BellvilleBranch;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactoryBellvilleBranchTest {

    @Test
    public void getBellvillBranch() {
        String bellBrId="BBr203";
        String bellStaffId="bs573";

        BellvilleBranch hd=FactoryBellvilleBranch.getBellvillBranch(bellBrId,bellStaffId);
        System.out.println(hd);
        Assert.assertNotNull(hd.getBellBrId()+"\n"+hd.getBellStaffId());
    }
}